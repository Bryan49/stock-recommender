package stock.recommender.api.objects.StockHistory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "meta",
        "timestamp",
        "events",
        "indicators"
})
public class Result {

    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("timestamp")
    private List<Integer> timestamp = null;
    @JsonProperty("indicators")
    private Indicators indicators;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("timestamp")
    public List<Integer> getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(List<Integer> timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("indicators")
    public Indicators getIndicators() {
        return indicators;
    }

    @JsonProperty("indicators")
    public void setIndicators(Indicators indicators) {
        this.indicators = indicators;
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