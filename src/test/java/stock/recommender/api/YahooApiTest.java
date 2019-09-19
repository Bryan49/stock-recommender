package stock.recommender.api;

import org.junit.Assert;
import org.junit.Test;

public class YahooApiTest {

    @Test
    public void testDeserialize() {
        try {

            YahooApi yahooApi = new YahooApi("2f074e7960msh5c02c30f816b308p1cc202jsn78140027bb50");
            Assert.assertTrue(yahooApi.getMarketSummary().size() > 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.fail();
        }
    }
}
