package stock.recommender.api;

import java.util.logging.Logger;

public class MockData {
    static Logger logger = Logger.getLogger("stock.recommender.api.MockData");

    public static String marketSummaryResponse = "{\"marketSummaryResponse\":{\"result\":[{\"exchangeTimezoneName\":\"America/New_York\"," +
            "\"fullExchangeName\":\"SNP\",\"symbol\":\"^GSPC\",\"regularMarketChange\":{\"raw\":-14.719971,\"fmt\":\"-14.72\"}," +
            "\"gmtOffSetMilliseconds\":-14400000,\"exchangeDataDelayedBy\":0,\"language\":\"en\"," +
            "\"regularMarketTime\":{\"raw\":1569014142,\"fmt\":\"5:15PM EDT\"},\"exchangeTimezoneShortName\":\"EDT\"," +
            "\"regularMarketChangePercent\":{\"raw\":-0.48955768,\"fmt\":\"-0.49%\"},\"quoteType\":\"INDEX\"," +
            "\"marketState\":\"PREPRE\",\"regularMarketPrice\":{\"raw\":2992.07,\"fmt\":\"2,992.07\"},\"market\":\"us_market\"," +
            "\"priceHint\":2,\"tradeable\":false,\"sourceInterval\":15,\"exchange\":\"SNP\",\"shortName\":\"S&P 500\"," +
            "\"region\":\"US\",\"triggerable\":true,\"regularMarketPreviousClose\":{\"raw\":3006.79,\"fmt\":\"3,006.79\"}}," +
            "{\"exchangeTimezoneName\":\"America/New_York\",\"fullExchangeName\":\"DJI\",\"symbol\":\"^DJI\"" +
            ",\"regularMarketChange\":{\"raw\":-159.73047,\"fmt\":\"-159.73\"},\"gmtOffSetMilliseconds\":-14400000," +
            "\"exchangeDataDelayedBy\":0,\"language\":\"en\",\"regularMarketTime\":{\"raw\":1569014142,\"fmt\":\"5:15PM EDT\"}," +
            "\"exchangeTimezoneShortName\":\"EDT\",\"regularMarketChangePercent\":{\"raw\":-0.58952445,\"fmt\":\"-0.59%\"}," +
            "\"quoteType\":\"INDEX\",\"marketState\":\"PREPRE\",\"regularMarketPrice\":{\"raw\":26935.07,\"fmt\":\"26,935.07\"}," +
            "\"market\":\"us_market\",\"priceHint\":2,\"tradeable\":false,\"sourceInterval\":120,\"exchange\":\"DJI\"," +
            "\"shortName\":\"Dow 30\",\"region\":\"US\",\"triggerable\":true,\"regularMarketPreviousClose\":{\"raw\":27094.8,\"fmt\":\"27,094.80\"}}," +
            "{\"exchangeTimezoneName\":\"America/New_York\",\"fullExchangeName\":\"Nasdaq GIDS\",\"symbol\":\"^IXIC\"," +
            "\"regularMarketChange\":{\"raw\":-65.20557,\"fmt\":\"-65.21\"},\"gmtOffSetMilliseconds\":-14400000,\"exchangeDataDelayedBy\":0," +
            "\"language\":\"en\",\"regularMarketTime\":{\"raw\":1569014159,\"fmt\":\"5:15PM EDT\"},\"exchangeTimezoneShortName\":\"EDT\"," +
            "\"regularMarketChangePercent\":{\"raw\":-0.79685354,\"fmt\":\"-0.80%\"},\"quoteType\":\"INDEX\",\"marketState\":\"PREPRE\"," +
            "\"regularMarketPrice\":{\"raw\":8117.6743,\"fmt\":\"8,117.67\"},\"market\":\"us_market\",\"priceHint\":2,\"tradeable\":false," +
            "\"sourceInterval\":15,\"exchange\":\"NIM\",\"shortName\":\"Nasdaq\",\"region\":\"US\",\"triggerable\":false," +
            "\"regularMarketPreviousClose\":{\"raw\":8182.88,\"fmt\":\"8,182.88\"}},{\"exchangeTimezoneName\":\"America/New_York\"," +
            "\"fullExchangeName\":\"Chicago Options\",\"symbol\":\"^RUT\",\"regularMarketChange\":{\"raw\":-1.7050781,\"fmt\":\"-1.71\"}," +
            "\"gmtOffSetMilliseconds\":-14400000,\"exchangeDataDelayedBy\":20,\"language\":\"en\",\"regularMarketTime\":{\"raw\":1569011406," +
            "\"fmt\":\"4:30PM EDT\"},\"exchangeTimezoneShortName\":\"EDT\",\"regularMarketChangePercent\":{\"raw\":-0.10919699,\"fmt\":\"-0.11%\"}," +
            "\"quoteType\":\"INDEX\",\"marketState\":\"PREPRE\",\"regularMarketPrice\":{\"raw\":1559.7649,\"fmt\":\"1,559.76\"},\"market\":\"us_market\"," +
            "\"priceHint\":2,\"tradeable\":false,\"sourceInterval\":15,\"exchange\":\"WCB\",\"shortName\":\"Russell 2000\",\"region\":\"US\",\"triggerable\":false," +
            "\"regularMarketPreviousClose\":{\"raw\":1561.47,\"fmt\":\"1,561.47\"}},{\"exchangeTimezoneName\":\"America/New_York\",\"fullExchangeName\":\"NY Mercantile\"," +
            "\"symbol\":\"CL=F\",\"regularMarketChange\":{\"raw\":0.66999817,\"fmt\":\"0.67\"},\"headSymbolAsString\":\"CL=F\",\"gmtOffSetMilliseconds\":-14400000," +
            "\"exchangeDataDelayedBy\":30,\"language\":\"en\",\"regularMarketTime\":{\"raw\":1569215038,\"fmt\":\"1:03AM EDT\"},\"exchangeTimezoneShortName\":\"EDT\"," +
            "\"regularMarketChangePercent\":{\"raw\":1.1533794,\"fmt\":\"1.15%\"},\"quoteType\":\"FUTURE\",\"marketState\":\"REGULAR\",\"regularMarketPrice\":{\"raw\":58.76," +
            "\"fmt\":\"58.76\"},\"market\":\"us24_market\",\"tradeable\":false,\"sourceInterval\":30,\"exchange\":\"NYM\",\"shortName\":\"Crude Oil\",\"region\":\"US\"," +
            "\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":58.09,\"fmt\":\"58.09\"}},{\"exchangeTimezoneName\":\"America/New_York\",\"fullExchangeName\":\"COMEX\"," +
            "\"symbol\":\"GC=F\",\"regularMarketChange\":{\"raw\":8.200073,\"fmt\":\"8.20\"},\"headSymbolAsString\":\"GC=F\",\"gmtOffSetMilliseconds\":-14400000,\"exchangeDataDelayedBy\":30," +
            "\"language\":\"en\",\"regularMarketTime\":{\"raw\":1569215038,\"fmt\":\"1:03AM EDT\"},\"exchangeTimezoneShortName\":\"EDT\",\"regularMarketChangePercent\":{\"raw\":0.5412233,\"fmt\":\"0.54%\"}," +
            "\"quoteType\":\"FUTURE\",\"marketState\":\"REGULAR\",\"regularMarketPrice\":{\"raw\":1523.3,\"fmt\":\"1,523.30\"},\"market\":\"us24_market\",\"tradeable\":false,\"sourceInterval\":15,\"exchange\":\"CMX\"," +
            "\"shortName\":\"Gold\",\"region\":\"US\",\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":1515.1,\"fmt\":\"1,515.10\"}}," +
            "{\"exchangeTimezoneName\":\"America/New_York\",\"fullExchangeName\":\"COMEX\",\"symbol\":\"SI=F\",\"regularMarketChange\":{\"raw\":0.5209999,\"fmt\":\"0.52\"}," +
            "\"headSymbolAsString\":\"SI=F\",\"gmtOffSetMilliseconds\":-14400000,\"exchangeDataDelayedBy\":30,\"language\":\"en\"," +
            "\"regularMarketTime\":{\"raw\":1569215040,\"fmt\":\"1:04AM EDT\"},\"exchangeTimezoneShortName\":\"EDT\"," +
            "\"regularMarketChangePercent\":{\"raw\":2.9189303,\"fmt\":\"2.92%\"},\"quoteType\":\"FUTURE\",\"marketState\":\"REGULAR\"," +
            "\"regularMarketPrice\":{\"raw\":18.37,\"fmt\":\"18.37\"},\"market\":\"us24_market\",\"tradeable\":false,\"sourceInterval\":15," +
            "\"exchange\":\"CMX\",\"shortName\":\"Silver\",\"region\":\"US\",\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":17.738,\"fmt\":\"17.74\"}}," +
            "{\"exchangeTimezoneName\":\"Europe/London\",\"fullExchangeName\":\"CCY\",\"symbol\":\"EURUSD=X\",\"regularMarketChange\":{\"raw\":-4.864931E-4,\"fmt\":\"-0.0005\"}," +
            "\"gmtOffSetMilliseconds\":3600000,\"exchangeDataDelayedBy\":0,\"language\":\"en-US\",\"regularMarketTime\":{\"raw\":1569215640,\"fmt\":\"6:14AM BST\"}," +
            "\"exchangeTimezoneShortName\":\"BST\",\"regularMarketChangePercent\":{\"raw\":-0.04410218,\"fmt\":\"-0.0441%\"}," +
            "\"quoteType\":\"CURRENCY\",\"marketState\":\"REGULAR\",\"regularMarketPrice\":{\"raw\":1.1025358,\"fmt\":\"1.1025\"}," +
            "\"market\":\"ccy_market\",\"priceHint\":4,\"tradeable\":false,\"currency\":\"USD\",\"sourceInterval\":15,\"exchange\":\"CCY\",\"shortName\":\"EUR/USD\",\"region\":\"US\",\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":1.1030223,\"fmt\":\"1.1030\"}}," +
            "{\"exchangeTimezoneName\":\"America/New_York\",\"fullExchangeName\":\"NYBOT\",\"symbol\":\"^TNX\"," +
            "\"regularMarketChange\":{\"raw\":0.0,\"fmt\":\"0.0000\"},\"gmtOffSetMilliseconds\":-14400000,\"exchangeDataDelayedBy\":30,\"language\":\"en\",\"regularMarketTime\":{\"raw\":1569005991,\"fmt\":\"2:59PM EDT\"}," +
            "\"exchangeTimezoneShortName\":\"EDT\",\"regularMarketChangePercent\":{\"raw\":0.0,\"fmt\":\"0.00%\"}," +
            "\"quoteType\":\"INDEX\",\"marketState\":\"REGULAR\",\"regularMarketPrice\":{\"raw\":1.7549999,\"fmt\":\"1.7550\"}," +
            "\"market\":\"us24_market\",\"priceHint\":4,\"tradeable\":false,\"sourceInterval\":30,\"exchange\":\"NYB\"," +
            "\"shortName\":\"10-Yr Bond\",\"region\":\"US\",\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":1.7549999,\"fmt\":\"1.7550\"}," +
            "\"longName\":\"Treasury Yield 10 Years\"},{\"exchangeTimezoneName\":\"America/New_York\",\"fullExchangeName\":\"Chicago Options\",\"symbol\":\"^VIX\"," +
            "\"regularMarketChange\":{\"raw\":1.2699995,\"fmt\":\"1.27\"},\"gmtOffSetMilliseconds\":-14400000,\"exchangeDataDelayedBy\":20," +
            "\"language\":\"en\",\"regularMarketTime\":{\"raw\":1569010491,\"fmt\":\"4:14PM EDT\"},\"exchangeTimezoneShortName\":\"EDT\"," +
            "\"regularMarketChangePercent\":{\"raw\":9.039142,\"fmt\":\"9.04%\"},\"quoteType\":\"INDEX\",\"marketState\":\"PREPRE\"," +
            "\"regularMarketPrice\":{\"raw\":15.32,\"fmt\":\"15.32\"},\"market\":\"us_market\",\"priceHint\":2,\"tradeable\":false," +
            "\"sourceInterval\":15,\"exchange\":\"WCB\",\"shortName\":\"Vix\",\"region\":\"US\",\"triggerable\":false," +
            "\"regularMarketPreviousClose\":{\"raw\":14.05,\"fmt\":\"14.05\"}},{\"exchangeTimezoneName\":\"Europe/London\"," +
            "\"fullExchangeName\":\"CCY\",\"symbol\":\"GBPUSD=X\",\"regularMarketChange\":{\"raw\":8.401871E-4,\"fmt\":\"0.0008\"}," +
            "\"gmtOffSetMilliseconds\":3600000,\"exchangeDataDelayedBy\":0,\"language\":\"en-US\",\"regularMarketTime\":{\"raw\":1569215640,\"fmt\":\"6:14AM BST\"}," +
            "\"exchangeTimezoneShortName\":\"BST\",\"regularMarketChangePercent\":{\"raw\":0.067382656,\"fmt\":\"0.0674%\"}," +
            "\"quoteType\":\"CURRENCY\",\"marketState\":\"REGULAR\",\"regularMarketPrice\":{\"raw\":1.2477852,\"fmt\":\"1.2478\"}," +
            "\"market\":\"ccy_market\",\"priceHint\":4,\"tradeable\":false,\"currency\":\"USD\",\"sourceInterval\":15,\"exchange\":\"CCY\"," +
            "\"shortName\":\"GBP/USD\",\"region\":\"US\",\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":1.246945,\"fmt\":\"1.2469\"}}," +
            "{\"exchangeTimezoneName\":\"Europe/London\",\"fullExchangeName\":\"CCY\",\"symbol\":\"JPY=X\"," +
            "\"regularMarketChange\":{\"raw\":0.21600342,\"fmt\":\"0.2160\"},\"gmtOffSetMilliseconds\":3600000,\"exchangeDataDelayedBy\":0,\"language\":\"en-US\"," +
            "\"regularMarketTime\":{\"raw\":1569215642,\"fmt\":\"6:14AM BST\"},\"exchangeTimezoneShortName\":\"BST\"," +
            "\"regularMarketChangePercent\":{\"raw\":0.20090537,\"fmt\":\"0.2009%\"},\"quoteType\":\"CURRENCY\",\"marketState\":\"REGULAR\"," +
            "\"regularMarketPrice\":{\"raw\":107.731,\"fmt\":\"107.7310\"},\"market\":\"ccy_market\",\"quoteSourceName\":\"Delayed Quote\"," +
            "\"priceHint\":4,\"tradeable\":false,\"currency\":\"JPY\",\"sourceInterval\":15,\"exchange\":\"CCY\",\"shortName\":\"USD/JPY\"," +
            "\"region\":\"US\",\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":107.515,\"fmt\":\"107.5150\"}}," +
            "{\"exchangeTimezoneName\":\"Europe/London\",\"fullExchangeName\":\"CCC\",\"symbol\":\"BTC-USD\"," +
            "\"regularMarketChange\":{\"raw\":-60.06543,\"fmt\":\"-60.07\"},\"gmtOffSetMilliseconds\":3600000," +
            "\"exchangeDataDelayedBy\":0,\"language\":\"en\",\"regularMarketTime\":{\"raw\":1569215550,\"fmt\":\"6:12AM BST\"}," +
            "\"exchangeTimezoneShortName\":\"BST\",\"regularMarketChangePercent\":{\"raw\":-0.5964757,\"fmt\":\"-0.60%\"},\"quoteType\":\"CRYPTOCURRENCY\"," +
            "\"marketState\":\"REGULAR\",\"regularMarketPrice\":{\"raw\":10009.989,\"fmt\":\"10,009.99\"},\"market\":\"ccc_market\"," +
            "\"quoteSourceName\":\"CryptoCompare\",\"tradeable\":true,\"sourceInterval\":15,\"exchange\":\"CCC\",\"region\":\"US\"," +
            "\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":10070.055,\"fmt\":\"10,070.05\"}}," +
            "{\"exchangeTimezoneName\":\"Europe/London\",\"fullExchangeName\":\"FTSE Index\",\"symbol\":\"^FTSE\"," +
            "\"regularMarketChange\":{\"raw\":-11.5,\"fmt\":\"-11.50\"},\"gmtOffSetMilliseconds\":3600000," +
            "\"exchangeDataDelayedBy\":15,\"language\":\"en\",\"regularMarketTime\":{\"raw\":1568994363,\"fmt\":\"4:46PM BST\"}," +
            "\"exchangeTimezoneShortName\":\"BST\",\"regularMarketChangePercent\":{\"raw\":-0.15632604,\"fmt\":\"-0.16%\"}," +
            "\"quoteType\":\"INDEX\",\"marketState\":\"PREPRE\",\"regularMarketPrice\":{\"raw\":7344.92,\"fmt\":\"7,344.92\"}," +
            "\"market\":\"gb_market\",\"priceHint\":2,\"tradeable\":false,\"sourceInterval\":15,\"exchange\":\"FGI\"," +
            "\"shortName\":\"FTSE 100\",\"region\":\"US\",\"triggerable\":false,\"regularMarketPreviousClose\":" +
            "{\"raw\":7356.42,\"fmt\":\"7,356.42\"}},{\"exchangeTimezoneName\":\"Asia/Tokyo\",\"fullExchangeName\":\"Osaka\"," +
            "\"symbol\":\"^N225\",\"regularMarketChange\":{\"raw\":34.689453,\"fmt\":\"34.69\"}," +
            "\"gmtOffSetMilliseconds\":32400000,\"exchangeDataDelayedBy\":0,\"language\":\"en\",\"regularMarketTime\":" +
            "{\"raw\":1568960102,\"fmt\":\"3:15PM JST\"},\"exchangeTimezoneShortName\":\"JST\",\"regularMarketChangePercent\":" +
            "{\"raw\":0.15736175,\"fmt\":\"0.16%\"},\"quoteType\":\"INDEX\",\"marketState\":\"CLOSED\",\"regularMarketPrice\":" +
            "{\"raw\":22079.09,\"fmt\":\"22,079.09\"},\"market\":\"jp_market\",\"priceHint\":2,\"tradeable\":false," +
            "\"sourceInterval\":20,\"exchange\":\"OSA\",\"shortName\":\"Nikkei 225\",\"region\":\"US\",\"triggerable\":false," +
            "\"regularMarketPreviousClose\":{\"raw\":22044.4,\"fmt\":\"22,044.40\"}}],\"error\":null}}";
}
