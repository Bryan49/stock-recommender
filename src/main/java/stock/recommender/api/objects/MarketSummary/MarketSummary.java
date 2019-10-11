package stock.recommender.api.objects.MarketSummary;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "marketSummaryResponse"
})
public class MarketSummary {

    @JsonProperty("marketSummaryResponse")
    private MarketSummaryResponse marketSummaryResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("marketSummaryResponse")
    public MarketSummaryResponse getMarketSummaryResponse() {
        return marketSummaryResponse;
    }

    @JsonProperty("marketSummaryResponse")
    public void setMarketSummaryResponse(MarketSummaryResponse marketSummaryResponse) {
        this.marketSummaryResponse = marketSummaryResponse;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}