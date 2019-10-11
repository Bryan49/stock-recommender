package stock.recommender.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.http.HttpStatus;
import stock.recommender.api.objects.MarketSummary.MarketSummary;
import stock.recommender.api.objects.MarketSummary.MarketExchange;
import stock.recommender.api.objects.StockHistory.StockHistory;
import stock.recommender.pojo.StockRecommenderException;

import java.io.IOException;
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

    public MarketSummary getMarketSummary() throws StockRecommenderException {
        try {
            HttpResponse<String> response = Unirest.get("https://apidojo-yahoo-finance-v1.p.rapidapi.com/market/get-summary?region=US&lang=en")
                    .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                    .header("x-rapidapi-key", this.apiKey)
                    .asString();
            if (response.getStatus() == HttpStatus.SC_OK) {
                return this.objectMapper.readValue(response.getBody(), MarketSummary.class);
            } else {
                logger.warning("Failed to get successful response from api: " + response.getStatus() + " " + response.getStatusText());
                throw new StockRecommenderException("Failed to get successful response from api. Check logs for details.");
            }
        } catch (IOException e) {
            logger.severe("Failed to deserialize api results: " + e.getMessage());
            throw new StockRecommenderException("Failed to deserialize api results. Check logs for details.");
        } catch (UnirestException e) {
            logger.severe("Failed to successfully call api: " + e.getMessage());
            throw new StockRecommenderException("Failed to get successful response from api. Check logs for details.");
        }
    }

    public StockHistory getStockHistory() throws StockRecommenderException {
        try {
            HttpResponse<String> response = Unirest.get("https://apidojo-yahoo-finance-v1.p.rapidapi" +
                    ".com/stock/get-histories?region=US&lang=en&symbol=MSFT&from=1561939200&to=1569888000&events=div" +
                    "&interval=1mo")
                    .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                    .header("x-rapidapi-key", this.apiKey)
                    .asString();
            if (response.getStatus() == HttpStatus.SC_OK) {
                return this.objectMapper.readValue(MockData.stockHistoryResponse, StockHistory.class);
            } else {
                logger.warning("Failed to get successful response from api: " + response.getStatus() + " " + response.getStatusText());
                throw new StockRecommenderException("Failed to get successful response from api. Check logs for details.");
            }
        } catch (IOException e) {
            logger.severe("Failed to deserialize api results: " + e.getMessage());
            return new StockHistory();
        } catch (UnirestException e) {
            logger.severe("Failed to successfully call api: " + e.getMessage());
            throw new StockRecommenderException("Failed to get successful response from api. Check logs for details.");
        }
    }

    public Map<String, MarketExchange> getMarketSummaryBySymbol() throws StockRecommenderException {
        return getMarketSummary().getMarketSummaryResponse().getMarketExchange().stream().collect(Collectors.toMap(MarketExchange::getSymbol, Function.identity()));
    }
}