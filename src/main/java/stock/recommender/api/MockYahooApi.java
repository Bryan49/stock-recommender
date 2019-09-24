package stock.recommender.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.http.HttpStatus;
import stock.recommender.api.objects.MarketExchangeSummary;
import stock.recommender.api.objects.MarketSummaryResponse;
import stock.recommender.pojo.StockRecommenderException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
                .configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true)
                .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
    }

    public boolean testConnection() {
        return true;
    }

    public List<MarketExchangeSummary> getMarketSummary() throws StockRecommenderException {
        try {
            return this.objectMapper.readValue(MockData.marketSummaryResponse, MarketSummaryResponse.class).getResult();
        } catch (IOException e) {
            logger.severe("Failed to deserialize api results: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public Map<String, MarketExchangeSummary> getMarketSummaryBySymbol() throws StockRecommenderException {
        return getMarketSummary().stream().collect(Collectors.toMap(MarketExchangeSummary::getSymbol, Function.identity()));
    }
}