package stock.recommender;

import stock.recommender.api.YahooApi;
import stock.recommender.api.objects.MarketExchangeSummary;

public class StockRecommenderApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Stock Recommender!");

        YahooApi yahooApi = new YahooApi("2f074e7960msh5c02c30f816b308p1cc202jsn78140027bb50");

        for (MarketExchangeSummary summary : yahooApi.getMarketSummary()) {
            System.out.println(summary.getExchangeName());
            System.out.println("\t-" + summary.getRegion());
            System.out.println("\t-" + summary.getTimeZone());
            System.out.println("\t-" + summary.getMarketPrice() + "\n");
        }
    }
}
