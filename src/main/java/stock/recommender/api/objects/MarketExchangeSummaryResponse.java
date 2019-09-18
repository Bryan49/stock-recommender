package stock.recommender.api.objects;

import java.util.ArrayList;
import java.util.List;

public class MarketExchangeSummaryResponse {
    List<MarketExchangeSummary> result;

    public MarketExchangeSummaryResponse() {
        this.result = new ArrayList<>();
    }

    public List<MarketExchangeSummary> getResult() {
        return result;
    }

    public void setResult(List<MarketExchangeSummary> result) {
        this.result = result;
    }
}
