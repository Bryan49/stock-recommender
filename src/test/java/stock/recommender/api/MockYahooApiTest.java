package stock.recommender.api;

import org.junit.Assert;
import org.junit.Test;
import stock.recommender.pojo.StockRecommenderException;

public class MockYahooApiTest {
    @Test
    public void testGetMockMarketSummaryDataList() {
        try {
            MockYahooApi mockYahooApi = new MockYahooApi();
            Assert.assertTrue(mockYahooApi.getMarketSummary().size() > 0);
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
}
