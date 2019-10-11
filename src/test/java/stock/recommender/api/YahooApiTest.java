package stock.recommender.api;

import org.junit.Assert;
import org.junit.Test;
import stock.recommender.api.objects.StockHistory.StockHistory;
import stock.recommender.pojo.StockRecommenderException;

public class YahooApiTest {

    @Test
    public void testGetMarketSummary() {
        try {
            YahooApi yahooApi = new YahooApi("2f074e7960msh5c02c30f816b308p1cc202jsn78140027bb50");
            Assert.assertTrue(yahooApi.getMarketSummary().getMarketSummaryResponse().getMarketExchange().size() > 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.fail();
        }
    }

    @Test
    public void testGetStockHistory() {
        try {
            YahooApi yahooApi = new YahooApi("2f074e7960msh5c02c30f816b308p1cc202jsn78140027bb50");
            StockHistory stockHistory = yahooApi.getStockHistory();
            Assert.assertTrue((stockHistory.getChart().getResult().size() > 0));
        } catch (StockRecommenderException e) {
            Assert.fail();
        }
    }

}
