package stock.recommender.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.http.HttpStatus;
import stock.recommender.api.objects.MarketExchangeSummary;
import stock.recommender.api.objects.MarketExchangeSummaryResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class YahooApi {
    static Logger logger = Logger.getLogger("YahooApi");

    public static List<MarketExchangeSummary> getMarketSummary() {
        try {
            HttpResponse<String> response = Unirest.get("https://apidojo-yahoo-finance-v1.p.rapidapi.com/market/get-summary?region=US&lang=en")
                    .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                    .header("x-rapidapi-key", "2f074e7960msh5c02c30f816b308p1cc202jsn78140027bb50")
                    .asString();
            if (response.getStatus() == HttpStatus.SC_OK) {
                return new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                        .readValue(response.getBody(), MarketExchangeSummaryResponse.class).getResult();
            } else {
                logger.warning("Failed to get successful response from api: " + response.getStatus());
                return new ArrayList<>();
            }
        } catch (IOException e) {
            logger.severe("Failed to deserialize api results: " + e.getMessage());
            return new ArrayList<>();
        } catch (UnirestException e) {
            logger.severe("Failed to successfully call api: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
