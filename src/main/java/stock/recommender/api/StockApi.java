package stock.recommender.api;

import stock.recommender.api.objects.MarketSummary.MarketExchange;
import stock.recommender.api.objects.MarketSummary.MarketSummary;
import stock.recommender.api.objects.MarketSummary.MarketSummaryResponse;
import stock.recommender.pojo.StockRecommenderException;

import java.util.Map;

public interface StockApi {
    /**
     * Tests the connection of the api
     * @return boolean This returns if the connection was successful (true)
     */
    boolean testConnection();

    /**
     * Gets a list of market exchange summaries
     * @return List The list of market exchange summaries
     * @exception StockRecommenderException Throws exception if issue occurs during get
     */
    MarketSummary getMarketSummary() throws StockRecommenderException;

    Map<String, MarketExchange> getMarketSummaryBySymbol() throws StockRecommenderException;

}
