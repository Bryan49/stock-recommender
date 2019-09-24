package stock.recommender.api;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import stock.recommender.api.objects.MarketExchangeSummary;
import stock.recommender.pojo.StockRecommenderException;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class StockData {
    static Logger logger = Logger.getLogger("StockData");

    StockApi stockApi;

    public StockData(StockApi stockApi) {
        this.stockApi = stockApi;
    }

    LoadingCache<String, MarketExchangeSummary> cache = Caffeine.newBuilder()
            .maximumSize(100)
            .expireAfterWrite(1, TimeUnit.MINUTES)
            .build(k -> lookupMarketExchangeSummary(k));

    public MarketExchangeSummary getMarketExchangeSummary(String symbol) {
        return cache.get(symbol);
    }

    public Set<MarketExchangeSummary> getMarketExchangeSummary(Set<String> symbols) {
        Set<MarketExchangeSummary> summaries = new HashSet<>();
        symbols.forEach(symbol->summaries.add(cache.get(symbol)));
        return summaries;
    }

    private MarketExchangeSummary lookupMarketExchangeSummary(String symbol) {
        try {
            Map<String, MarketExchangeSummary> summaryBySymbol = this.stockApi.getMarketSummaryBySymbol();
            if (summaryBySymbol.containsKey(symbol)) return summaryBySymbol.get(symbol);
            else return getNotFoundSummary();
        } catch (StockRecommenderException e) {
            logger.warning("Couldn't fetch market exchange summary for " + symbol + "\n" + e.getMessage());
            return new MarketExchangeSummary();
        }
    }

    private MarketExchangeSummary getNotFoundSummary() {
        MarketExchangeSummary summary = new MarketExchangeSummary();
        return summary.setExchangeName("FailedToFindSummary").setRegion("N/A").setTimeZone("N/A").setSymbol("N/A");
    }
}
