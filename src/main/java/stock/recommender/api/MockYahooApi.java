package stock.recommender.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import stock.recommender.api.objects.MarketSummary.MarketExchange;
import stock.recommender.api.objects.MarketSummary.MarketSummary;
import stock.recommender.api.objects.MarketSummary.MarketSummaryResponse;
import stock.recommender.api.objects.StockHistory.StockHistory;
import stock.recommender.pojo.StockRecommenderException;

import java.io.IOException;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MockYahooApi implements StockApi {
    static Logger logger = Logger.getLogger("MockYahooApi");
    ObjectMapper objectMapper;

    public MockYahooApi() {
        this.objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
                .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
    }

    public boolean testConnection() {
        return true;
    }

    public MarketSummary getMarketSummary() throws StockRecommenderException {
        try {
            return this.objectMapper.readValue(MockData.marketSummaryResponse, MarketSummary.class);
        } catch (IOException e) {
            logger.severe("Failed to deserialize mock market summary: " + e.getMessage());
            throw new StockRecommenderException("Failed to deserialize mock market summary: " + e.getMessage());
        }
    }

    public Map<String, MarketExchange> getMarketSummaryBySymbol() throws StockRecommenderException {
        return getMarketSummary().getMarketSummaryResponse().getMarketExchange().stream().collect(Collectors.toMap(MarketExchange::getSymbol, Function.identity()));
    }

    public StockHistory getStockHistory() throws StockRecommenderException {
        try {
            return this.objectMapper.readValue(MockData.stockHistoryResponse, StockHistory.class);
        } catch (IOException e) {
            logger.severe("Failed to deserialize mock stock history: " + e.getMessage());
            throw new StockRecommenderException("Failed to deserialize mock stock history: " + e.getMessage());
        }
    }
}