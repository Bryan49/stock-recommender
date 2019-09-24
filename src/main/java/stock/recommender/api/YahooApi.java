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

public class YahooApi implements StockApi {
    static Logger logger = Logger.getLogger("YahooApi");
    ObjectMapper objectMapper;

    String apiKey;

    public YahooApi(String apiKey) {
        this.objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true)
                .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        this.apiKey = apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public boolean testConnection() {
        try {
            HttpResponse<String> response = Unirest.get("https://apidojo-yahoo-finance-v1.p.rapidapi.com/market/get-summary?region=US&lang=en")
                    .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                    .header("x-rapidapi-key", this.apiKey)
                    .asString();
            if (response.getStatus() == HttpStatus.SC_OK) {
                return true;
            } else {
                return false;
            }
        } catch (UnirestException e) {
            return false;
        }
    }

    public List<MarketExchangeSummary> getMarketSummary() throws StockRecommenderException {
        try {
            HttpResponse<String> response = Unirest.get("https://apidojo-yahoo-finance-v1.p.rapidapi.com/market/get-summary?region=US&lang=en")
                    .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                    .header("x-rapidapi-key", this.apiKey)
                    .asString();
            if (response.getStatus() == HttpStatus.SC_OK) {
                return this.objectMapper.readValue(response.getBody(), MarketSummaryResponse.class).getResult();
            } else {
                logger.warning("Failed to get successful response from api: " + response.getStatus() + " " + response.getStatusText());
                throw new StockRecommenderException("Failed to get successful response from api. Check logs for details.");
            }
        } catch (IOException e) {
            logger.severe("Failed to deserialize api results: " + e.getMessage());
            return new ArrayList<>();
        } catch (UnirestException e) {
            logger.severe("Failed to successfully call api: " + e.getMessage());
            throw new StockRecommenderException("Failed to get successful response from api. Check logs for details.");
        }
    }

    public Map<String, MarketExchangeSummary> getMarketSummaryBySymbol() throws StockRecommenderException {
        return getMarketSummary().stream().collect(Collectors.toMap(MarketExchangeSummary::getSymbol, Function.identity()));
    }
}