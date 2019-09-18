package stock.recommender;

import stock.recommender.api.YahooApi;

public class StockRecommenderApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Stock Recommender!");

        System.out.println(YahooApi.getMarketSummary());
    }
}
