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
        "quote",
        "adjclose"
})
public class Indicators {

    @JsonProperty("quote")
    private List<Quote> quote = null;
    @JsonProperty("adjclose")
    private List<Adjclose> adjclose = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quote")
    public List<Quote> getQuote() {
        return quote;
    }

    @JsonProperty("quote")
    public void setQuote(List<Quote> quote) {
        this.quote = quote;
    }

    @JsonProperty("adjclose")
    public List<Adjclose> getAdjclose() {
        return adjclose;
    }

    @JsonProperty("adjclose")
    public void setAdjclose(List<Adjclose> adjclose) {
        this.adjclose = adjclose;
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
