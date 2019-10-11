package stock.recommender.api;

import org.junit.Assert;
import org.junit.Test;
import stock.recommender.api.objects.StockHistory.StockHistory;
import stock.recommender.pojo.StockRecommenderException;

public class MockYahooApiTest {
    @Test
    public void testGetMockMarketSummaryDataList() {
        try {
            MockYahooApi mockYahooApi = new MockYahooApi();
            Assert.assertTrue(mockYahooApi.getMarketSummary().getMarketSummaryResponse().getMarketExchange().size() > 0);
        } catch (StockRecommenderException e) {
            Assert.fail();
        }
    }

    @Test
    public void testGetMockMarketSummaryDataMap() {
        try {
            MockYahooApi mockYahooApi = new MockYahooApi();
            Assert.assertTrue(mockYahooApi.getMarketSummaryBySymbol().size() > 0);
        } catch (StockRecommenderException e) {
            Assert.fail();
        }
    }

    @Test
    public void testGetMockStockHistory() {
        try {
            MockYahooApi mockYahooApi = new MockYahooApi();
            StockHistory stockHistory = mockYahooApi.getStockHistory();
            Assert.assertTrue((stockHistory.getChart().getResult().size() > 0));
        } catch (StockRecommenderException e) {
            Assert.fail();
        }
    }
}
