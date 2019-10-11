package stock.recommender.api;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import stock.recommender.api.objects.MarketSummary.MarketExchange;
import stock.recommender.pojo.StockRecommenderException;

import java.util.HashMap;
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

    LoadingCache<String, MarketExchange> cache = Caffeine.newBuilder()
            .maximumSize(100)
            .expireAfterWrite(1, TimeUnit.MINUTES)
            .build(k -> lookupMarketExchangeSummary(k));

    public MarketExchange getMarketExchangeSummary(String symbol) {
        return cache.get(symbol);
    }

    public Set<MarketExchange> getMarketExchangeSummary(Set<String> symbols) {
        Set<MarketExchange> summaries = new HashSet<>();
        symbols.forEach(symbol->summaries.add(cache.get(symbol)));
        return summaries;
    }

    private MarketExchange lookupMarketExchangeSummary(String symbol) {
        try {
            Map<String, MarketExchange> summaryBySymbol = makeKeysLowerCase(this.stockApi.getMarketSummaryBySymbol());
            if (summaryBySymbol.containsKey(symbol)) return summaryBySymbol.get(symbol);
            else return getNotFoundSummary();
        } catch (StockRecommenderException e) {
            logger.warning("Couldn't fetch market exchange summary for " + symbol + "\n" + e.getMessage());
            return new MarketExchange();
        }
    }

    private MarketExchange getNotFoundSummary() {
        MarketExchange summary = new MarketExchange();
        return summary.setFullExchangeName("FailedToFindSummary").setExchangeTimezoneName("N/A").setSymbol("N/A");
    }

    private Map<String, MarketExchange> makeKeysLowerCase(Map<String, MarketExchange> summaryBySymbol) {
        Map<String, MarketExchange> withLowerCaseKeys = new HashMap<>();
        for (Map.Entry<String, MarketExchange> entry : summaryBySymbol.entrySet()) {
            withLowerCaseKeys.put(entry.getKey().toLowerCase(), entry.getValue());
        }
        return withLowerCaseKeys;
    }
}
