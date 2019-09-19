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
    private String shortName;
    private String region;

    public MarketExchangeSummary() {
        this.exchangeName = "";
        this.timeZone = "";
        this.shortName = "";
        this.region = "";
        this.marketPrice = 0F;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Float getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Map<String, String> marketPrice) {
        if (marketPrice.containsKey("raw")) this.marketPrice = Float.valueOf(marketPrice.get("raw"));
    }
}
