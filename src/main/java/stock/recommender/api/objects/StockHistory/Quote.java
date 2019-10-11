package stock.recommender.api.objects.StockHistory;

import java.util.ArrayList;
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
        "volume",
        "open",
        "low",
        "close",
        "high"
})
public class Quote {

    @JsonProperty("volume")
    private List<Integer> volume = new ArrayList<>();
    @JsonProperty("open")
    private List<Float> open = new ArrayList<>();
    @JsonProperty("low")
    private List<Float> low = new ArrayList<>();
    @JsonProperty("close")
    private List<Float> close = new ArrayList<>();
    @JsonProperty("high")
    private List<Float> high = new ArrayList<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("volume")
    public List<Integer> getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(List<Integer> volume) {
        this.volume = volume;
    }

    @JsonProperty("open")
    public List<Float> getOpen() {
        return open;
    }

    @JsonProperty("open")
    public void setOpen(List<Float> open) {
        this.open = open;
    }

    @JsonProperty("low")
    public List<Float> getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(List<Float> low) {
        this.low = low;
    }

    @JsonProperty("close")
    public List<Float> getClose() {
        return close;
    }

    @JsonProperty("close")
    public void setClose(List<Float> close) {
        this.close = close;
    }

    @JsonProperty("high")
    public List<Float> getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(List<Float> high) {
        this.high = high;
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
