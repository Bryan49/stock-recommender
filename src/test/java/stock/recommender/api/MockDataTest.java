package stock.recommender.api;

import org.junit.Assert;
import org.junit.Test;
import stock.recommender.pojo.StockRecommenderException;

public class MockDataTest {
    @Test
    public void testGetMockMarketSummaryData() {
        try {
            stock.recommender.api.MockData mockData = new stock.recommender.api.MockData();
            Assert.assertTrue(mockData.getMarketExchangeSummaries().size() > 0);
        } catch (StockRecommenderException e) {
            Assert.fail();
        }
    }
}
