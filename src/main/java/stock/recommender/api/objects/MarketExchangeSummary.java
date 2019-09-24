package stock.recommender.api.objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
public class MarketExchangeSummary {
    @JsonProperty("fullExchangeName")
    private String exchangeName;

    @JsonProperty("exchangeTimezoneName")
    private String timeZone;

    @JsonProperty("regularMarketPrice")
    private Float marketPrice;
    @JsonProperty("exchange")
    private String symbol;
    private String region;

    public MarketExchangeSummary() {
        this.exchangeName = "";
        this.timeZone = "";
        this.symbol = "";
        this.region = "";
        this.marketPrice = 0F;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public MarketExchangeSummary setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public MarketExchangeSummary setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public String getSymbol() {
        return symbol;
    }

    public MarketExchangeSummary setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public MarketExchangeSummary setRegion(String region) {
        this.region = region;
        return this;
    }

    public Float getMarketPrice() {
        return marketPrice;
    }

    public MarketExchangeSummary setMarketPrice(Map<String, String> marketPrice) {
        if (marketPrice.containsKey("raw")) this.marketPrice = Float.valueOf(marketPrice.get("raw"));
        return this;
    }
}
