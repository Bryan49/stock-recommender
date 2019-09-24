package stock.recommender.api;

import stock.recommender.api.objects.MarketExchangeSummary;
import stock.recommender.pojo.StockRecommenderException;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

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
    List<MarketExchangeSummary> getMarketSummary() throws StockRecommenderException;

    Map<String,MarketExchangeSummary> getMarketSummaryBySymbol() throws StockRecommenderException;

}
