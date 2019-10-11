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
        "currency",
        "symbol",
        "exchangeName",
        "instrumentType",
        "firstTradeDate",
        "regularMarketTime",
        "gmtoffset",
        "timezone",
        "exchangeTimezoneName",
        "regularMarketPrice",
        "chartPreviousClose",
        "priceHint",
        "currentTradingPeriod",
        "dataGranularity",
        "range",
        "validRanges"
})
public class Meta {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("exchangeName")
    private String exchangeName;
    @JsonProperty("instrumentType")
    private String instrumentType;
    @JsonProperty("firstTradeDate")
    private Integer firstTradeDate;
    @JsonProperty("regularMarketTime")
    private Integer regularMarketTime;
    @JsonProperty("gmtoffset")
    private Integer gmtoffset;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("exchangeTimezoneName")
    private String exchangeTimezoneName;
    @JsonProperty("regularMarketPrice")
    private Double regularMarketPrice;
    @JsonProperty("chartPreviousClose")
    private Double chartPreviousClose;
    @JsonProperty("priceHint")
    private Integer priceHint;
    @JsonProperty("dataGranularity")
    private String dataGranularity;
    @JsonProperty("range")
    private String range;
    @JsonProperty("validRanges")
    private List<String> validRanges = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("exchangeName")
    public String getExchangeName() {
        return exchangeName;
    }

    @JsonProperty("exchangeName")
    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    @JsonProperty("instrumentType")
    public String getInstrumentType() {
        return instrumentType;
    }

    @JsonProperty("instrumentType")
    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    @JsonProperty("firstTradeDate")
    public Integer getFirstTradeDate() {
        return firstTradeDate;
    }

    @JsonProperty("firstTradeDate")
    public void setFirstTradeDate(Integer firstTradeDate) {
        this.firstTradeDate = firstTradeDate;
    }

    @JsonProperty("regularMarketTime")
    public Integer getRegularMarketTime() {
        return regularMarketTime;
    }

    @JsonProperty("regularMarketTime")
    public void setRegularMarketTime(Integer regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    @JsonProperty("gmtoffset")
    public Integer getGmtoffset() {
        return gmtoffset;
    }

    @JsonProperty("gmtoffset")
    public void setGmtoffset(Integer gmtoffset) {
        this.gmtoffset = gmtoffset;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("exchangeTimezoneName")
    public String getExchangeTimezoneName() {
        return exchangeTimezoneName;
    }

    @JsonProperty("exchangeTimezoneName")
    public void setExchangeTimezoneName(String exchangeTimezoneName) {
        this.exchangeTimezoneName = exchangeTimezoneName;
    }

    @JsonProperty("regularMarketPrice")
    public Double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    @JsonProperty("regularMarketPrice")
    public void setRegularMarketPrice(Double regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    @JsonProperty("chartPreviousClose")
    public Double getChartPreviousClose() {
        return chartPreviousClose;
    }

    @JsonProperty("chartPreviousClose")
    public void setChartPreviousClose(Double chartPreviousClose) {
        this.chartPreviousClose = chartPreviousClose;
    }

    @JsonProperty("priceHint")
    public Integer getPriceHint() {
        return priceHint;
    }

    @JsonProperty("priceHint")
    public void setPriceHint(Integer priceHint) {
        this.priceHint = priceHint;
    }

    @JsonProperty("dataGranularity")
    public String getDataGranularity() {
        return dataGranularity;
    }

    @JsonProperty("dataGranularity")
    public void setDataGranularity(String dataGranularity) {
        this.dataGranularity = dataGranularity;
    }

    @JsonProperty("range")
    public String getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(String range) {
        this.range = range;
    }

    @JsonProperty("validRanges")
    public List<String> getValidRanges() {
        return validRanges;
    }

    @JsonProperty("validRanges")
    public void setValidRanges(List<String> validRanges) {
        this.validRanges = validRanges;
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
