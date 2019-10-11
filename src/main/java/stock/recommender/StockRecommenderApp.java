package stock.recommender;

import stock.recommender.api.*;
import stock.recommender.api.objects.MarketSummary.MarketExchange;
import stock.recommender.util.TextUtil;

import java.util.*;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class StockRecommenderApp {
    static Logger logger = Logger.getLogger("StockRecommenderApp");

    public static void main(String[] args) {
        System.out.println("Welcome to the Stock Recommender!");

        String mainMenuOption, marketMenuOption;
        Boolean usingRealData;
        StockApi stockApi;
        StockData stockData;

        Optional<String> apiKey;

        Set<String> twoOptions = new HashSet<>(Arrays.asList("1", "2"));
        Set<String> threeOptions = new HashSet<>(Arrays.asList("1", "2", "3"));

        usingRealData = queryForInput("Want to use real or mock data?\n1) Real Data\n2) Mock Data", twoOptions).equals("1") ? true : false;
        while (true) {
            if (usingRealData) {
                apiKey = Optional.of(ConsoleReader.readLine("Enter apiKey (press enter for default): "));
                if (TextUtil.isEmptyOrWhitespace(apiKey.get())) {
                    apiKey = Optional.of("2f074e7960msh5c02c30f816b308p1cc202jsn78140027bb50");
                    logger.info("Api key to default one");
                } else {
                    logger.info("Testing api key...");
                }
                stockApi = new YahooApi(apiKey.get());
                if (stockApi.testConnection()) {
                    logger.info("Successfully validated api key");
                    break;
                } else {
                    logger.warning("Failed to validate api key, try again...");
                    continue;
                }
            } else {
                stockApi = new MockYahooApi();
                logger.info("Using mock data");
                break;
            }
        }

        while (true) {
            stockData = new StockData(stockApi);
            mainMenuOption = queryForInput("What would you like to do?\n1) Query market data\n2) Query stock specific data\n3) Exit", threeOptions);
            if (mainMenuOption.equals("1")) {
                while (true) {
                    marketMenuOption = queryForInput("What would you like to do?\n1) Get summary\n2) Get movers\n3) Go back", threeOptions);
                    if (marketMenuOption.equals("1")) {
                        while (true) {
                            String marketSummarySymbol = ConsoleReader.readLine(("Enter the symbol for your desired market summary." +
                                    "Type exit to go back: "));
                            if (marketSummarySymbol.equalsIgnoreCase("exit")) break;
                            MarketExchange marketExchange = stockData.getMarketExchangeSummary(marketSummarySymbol);
                            printMarketSummary(marketExchange);
                        }
                    } else if (marketMenuOption.equals("2")) {
                        logger.info("Feature not supported. Please try again later");
                    } else {
                        break;
                    }
                }
            } else if (mainMenuOption.equals("2")) {
                logger.info("Stock specific features not supported. Please try again later");
            } else {
                logger.info("Exiting...");
                System.exit(0);
            }
        }
    }

    private static void printMarketSummary(MarketExchange summary) {
        System.out.println(summary.getExchange());
        System.out.println("\t-" + summary.getRegion());
        System.out.println("\t-" + summary.getExchangeTimezoneShortName());
        System.out.println("\t-$" + summary.getRegularMarketPrice() + "\n");
    }

    private static String queryForInput(String prompt, Set<String> options) {
        while (true) {
            String input = ConsoleReader.readLine(prompt);
            if (options.contains(input)) {
                return input;
            } else {
                System.out.println("Invalid option, try again...\n");
            }
        }
    }

    private static class ConsoleReader {
        private static volatile Boolean isRunningInIde = null;
        public static String readLine (String prompt) {
            return read(prompt, () -> System.console().readLine());
        }
        public static String readPassword(String prompt) {
            return read(prompt, () -> String.valueOf(System.console().readPassword()));
        }

        private static String read(String prompt, Supplier<String> supplier) {
            System.out.println("\u001B[34m"+prompt+"\u001B[32m");
            if (isRunningInIde == null || !isRunningInIde) {
                try {
                    return supplier.get();
                } catch (NullPointerException e) {
                    isRunningInIde = true;
                }
            }
            return new Scanner(System.in).nextLine();
        }
    }
}
