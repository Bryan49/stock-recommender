package stock.recommender.api.objects;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

@JsonRootName(value = "marketSummaryResponse")
public class MarketSummaryResponse {
    List<MarketExchangeSummary> result;

    public MarketSummaryResponse() {
        this.result = new ArrayList<>();
    }

    public List<MarketExchangeSummary> getResult() {
        return result;
    }

    public void setResult(List<MarketExchangeSummary> result) {
        this.result = result;
    }
}
