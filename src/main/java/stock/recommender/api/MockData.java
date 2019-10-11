package stock.recommender.api;

import java.util.logging.Logger;

public class MockData {
    static Logger logger = Logger.getLogger("stock.recommender.api.MockData");

//    public static String stockHistoryResponse = "{\"chart\":{\"result\":[{\"meta\":{\"currency\":\"USD\"," +
//            "\"symbol\":\"MSFT\",\"exchangeName\":\"NMS\",\"instrumentType\":\"EQUITY\",\"firstTradeDate\":511088400," +
//            "\"regularMarketTime\":1570737601,\"gmtoffset\":-14400,\"timezone\":\"EDT\"," +
//            "\"exchangeTimezoneName\":\"America/New_York\",\"regularMarketPrice\":139.1,\"chartPreviousClose\":133" +
//            ".96,\"priceHint\":2,\"currentTradingPeriod\":{\"pre\":{\"timezone\":\"EDT\",\"start\":1570694400," +
//            "\"end\":1570714200,\"gmtoffset\":-14400},\"regular\":{\"timezone\":\"EDT\",\"start\":1570714200," +
//            "\"end\":1570737600,\"gmtoffset\":-14400},\"post\":{\"timezone\":\"EDT\",\"start\":1570737600," +
//            "\"end\":1570752000,\"gmtoffset\":-14400}},\"dataGranularity\":\"1mo\",\"range\":\"\"," +
//            "\"validRanges\":[\"1d\",\"5d\",\"1mo\",\"3mo\",\"6mo\",\"1y\",\"2y\",\"5y\",\"10y\",\"ytd\",\"max\"]}," +
//            "\"timestamp\":[1561953600,1564632000,1567310400],\"events\":{\"dividends\":{\"1564632000\":{\"amount\":0" +
//            ".46,\"date\":1565789400}}},\"indicators\":{\"quote\":[{\"volume\":[484079900,584482000,472544800]," +
//            "\"open\":[136.6300048828125,137.0,136.61000061035156],\"low\":[134.6699981689453,130.77999877929688,134" +
//            ".50999450683594],\"close\":[136.27000427246094,137.86000061035156,139.02999877929688],\"high\":[141" +
//            ".67999267578125,140.94000244140625,142.3699951171875]}],\"adjclose\":[{\"adjclose\":[135.81773376464844," +
//            "137.40245056152344,139.02999877929688]}]}}],\"error\":null}}";

    public static String stockHistoryResponse = "{\"chart\":{\"result\":[{\"meta\":{\"currency\":\"USD\"," +
            "\"symbol\":\"MSFT\",\"exchangeName\":\"NMS\",\"instrumentType\":\"EQUITY\",\"firstTradeDate\":511088400," +
            "\"regularMarketTime\":1570737601,\"gmtoffset\":-14400,\"timezone\":\"EDT\"," +
            "\"exchangeTimezoneName\":\"America/New_York\",\"regularMarketPrice\":139.1,\"chartPreviousClose\":133" +
            ".96,\"priceHint\":2,\"currentTradingPeriod\":{\"pre\":{\"timezone\":\"EDT\",\"start\":1570694400," +
            "\"end\":1570714200,\"gmtoffset\":-14400},\"regular\":{\"timezone\":\"EDT\",\"start\":1570714200," +
            "\"end\":1570737600,\"gmtoffset\":-14400},\"post\":{\"timezone\":\"EDT\",\"start\":1570737600," +
            "\"end\":1570752000,\"gmtoffset\":-14400}},\"dataGranularity\":\"1mo\",\"range\":\"\"," +
            "\"validRanges\":[\"1d\",\"5d\",\"1mo\",\"3mo\",\"6mo\",\"1y\",\"2y\",\"5y\",\"10y\",\"ytd\",\"max\"]}," +
            "\"timestamp\":[1561953600,1564632000,1567310400],\"events\":{\"dividends\":{\"1564632000\":{\"amount\":0" +
            ".46,\"date\":1565789400}}},\"indicators\":{\"quote\":[{\"volume\":[484079900,584482000,472544800]," +
            "\"open\":[136.6300048828125,137.0,136.61000061035156],\"low\":[134.6699981689453,130.77999877929688,134" +
            ".50999450683594],\"close\":[136.27000427246094,137.86000061035156,139.02999877929688],\"high\":[141" +
            ".67999267578125,140.94000244140625,142.3699951171875]}],\"adjclose\":[{\"adjclose\":[135.81773376464844," +
            "137.40245056152344,139.02999877929688]}]}}],\"error\":null}}";

    public static String marketSummaryResponse = "{\"marketSummaryResponse\":{\"result\":[{\"fullExchangeName\":\"SNP" +
            "\",\"exchangeTimezoneName\":\"America/New_York\",\"symbol\":\"^GSPC\"," +
            "\"regularMarketChange\":{\"raw\":18.72998,\"fmt\":\"18.73\"},\"gmtOffSetMilliseconds\":-14400000," +
            "\"exchangeDataDelayedBy\":0,\"language\":\"en\",\"regularMarketTime\":{\"raw\":1570741170," +
            "\"fmt\":\"4:59PM EDT\"},\"regularMarketChangePercent\":{\"raw\":0.64156955,\"fmt\":\"0.64%\"}," +
            "\"exchangeTimezoneShortName\":\"EDT\",\"quoteType\":\"INDEX\",\"regularMarketPrice\":{\"raw\":2938.13," +
            "\"fmt\":\"2,938.13\"},\"marketState\":\"PREPRE\",\"market\":\"us_market\",\"priceHint\":2," +
            "\"tradeable\":false,\"exchange\":\"SNP\",\"sourceInterval\":15,\"shortName\":\"S&P 500\"," +
            "\"region\":\"US\",\"triggerable\":true,\"regularMarketPreviousClose\":{\"raw\":2919.4,\"fmt\":\"2,919" +
            ".40\"}},{\"fullExchangeName\":\"DJI\",\"exchangeTimezoneName\":\"America/New_York\",\"symbol\":\"^DJI\"," +
            "\"regularMarketChange\":{\"raw\":150.66992,\"fmt\":\"150.67\"},\"gmtOffSetMilliseconds\":-14400000," +
            "\"exchangeDataDelayedBy\":0,\"language\":\"en\",\"regularMarketTime\":{\"raw\":1570741170," +
            "\"fmt\":\"4:59PM EDT\"},\"regularMarketChangePercent\":{\"raw\":0.57188916,\"fmt\":\"0.57%\"}," +
            "\"exchangeTimezoneShortName\":\"EDT\",\"quoteType\":\"INDEX\",\"regularMarketPrice\":{\"raw\":26496.67," +
            "\"fmt\":\"26,496.67\"},\"marketState\":\"PREPRE\",\"market\":\"us_market\",\"priceHint\":2," +
            "\"tradeable\":false,\"exchange\":\"DJI\",\"sourceInterval\":120,\"shortName\":\"Dow 30\"," +
            "\"region\":\"US\",\"triggerable\":true,\"regularMarketPreviousClose\":{\"raw\":26346.0,\"fmt\":\"26,346" +
            ".00\"}},{\"fullExchangeName\":\"Nasdaq GIDS\",\"exchangeTimezoneName\":\"America/New_York\"," +
            "\"symbol\":\"^IXIC\",\"regularMarketChange\":{\"raw\":47.03955,\"fmt\":\"47.04\"}," +
            "\"gmtOffSetMilliseconds\":-14400000,\"exchangeDataDelayedBy\":0,\"language\":\"en\"," +
            "\"regularMarketTime\":{\"raw\":1570742159,\"fmt\":\"5:15PM EDT\"}," +
            "\"regularMarketChangePercent\":{\"raw\":0.5951554,\"fmt\":\"0.60%\"}," +
            "\"exchangeTimezoneShortName\":\"EDT\",\"quoteType\":\"INDEX\",\"regularMarketPrice\":{\"raw\":7950.782," +
            "\"fmt\":\"7,950.78\"},\"marketState\":\"PREPRE\",\"market\":\"us_market\",\"priceHint\":2," +
            "\"tradeable\":false,\"exchange\":\"NIM\",\"sourceInterval\":15,\"shortName\":\"Nasdaq\"," +
            "\"region\":\"US\",\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":7903.7427,\"fmt\":\"7," +
            "903.74\"}},{\"fullExchangeName\":\"Chicago Options\",\"exchangeTimezoneName\":\"America/New_York\"," +
            "\"symbol\":\"^RUT\",\"regularMarketChange\":{\"raw\":5.90271,\"fmt\":\"5.90\"}," +
            "\"gmtOffSetMilliseconds\":-14400000,\"exchangeDataDelayedBy\":20,\"language\":\"en\"," +
            "\"regularMarketTime\":{\"raw\":1570739408,\"fmt\":\"4:30PM EDT\"}," +
            "\"regularMarketChangePercent\":{\"raw\":0.39897704,\"fmt\":\"0.40%\"}," +
            "\"exchangeTimezoneShortName\":\"EDT\",\"quoteType\":\"INDEX\",\"regularMarketPrice\":{\"raw\":1485.3636," +
            "\"fmt\":\"1,485.36\"},\"marketState\":\"PREPRE\",\"market\":\"us_market\",\"priceHint\":2," +
            "\"tradeable\":false,\"exchange\":\"WCB\",\"sourceInterval\":15,\"shortName\":\"Russell 2000\"," +
            "\"region\":\"US\",\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":1479.4609,\"fmt\":\"1," +
            "479.46\"}},{\"fullExchangeName\":\"NY Mercantile\",\"exchangeTimezoneName\":\"America/New_York\"," +
            "\"symbol\":\"CL=F\",\"regularMarketChange\":{\"raw\":0.29999924,\"fmt\":\"0.30\"}," +
            "\"gmtOffSetMilliseconds\":-14400000,\"headSymbolAsString\":\"CL=F\",\"exchangeDataDelayedBy\":30," +
            "\"language\":\"en\",\"regularMarketTime\":{\"raw\":1570768502,\"fmt\":\"12:35AM EDT\"}," +
            "\"regularMarketChangePercent\":{\"raw\":0.5602227,\"fmt\":\"0.56%\"}," +
            "\"exchangeTimezoneShortName\":\"EDT\",\"quoteType\":\"FUTURE\",\"regularMarketPrice\":{\"raw\":53.85," +
            "\"fmt\":\"53.85\"},\"marketState\":\"REGULAR\",\"market\":\"us24_market\",\"tradeable\":false," +
            "\"exchange\":\"NYM\",\"sourceInterval\":30,\"shortName\":\"Crude Oil\",\"region\":\"US\"," +
            "\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":52.59,\"fmt\":\"52.59\"}}," +
            "{\"fullExchangeName\":\"COMEX\",\"exchangeTimezoneName\":\"America/New_York\",\"symbol\":\"GC=F\"," +
            "\"regularMarketChange\":{\"raw\":-1.0,\"fmt\":\"-1.00\"},\"gmtOffSetMilliseconds\":-14400000," +
            "\"headSymbolAsString\":\"GC=F\",\"exchangeDataDelayedBy\":30,\"language\":\"en\"," +
            "\"regularMarketTime\":{\"raw\":1570768555,\"fmt\":\"12:35AM EDT\"}," +
            "\"regularMarketChangePercent\":{\"raw\":-0.06662669,\"fmt\":\"-0.07%\"}," +
            "\"exchangeTimezoneShortName\":\"EDT\",\"quoteType\":\"FUTURE\",\"regularMarketPrice\":{\"raw\":1499.9," +
            "\"fmt\":\"1,499.90\"},\"marketState\":\"REGULAR\",\"market\":\"us24_market\",\"tradeable\":false," +
            "\"exchange\":\"CMX\",\"sourceInterval\":15,\"shortName\":\"Gold\",\"region\":\"US\"," +
            "\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":1500.9,\"fmt\":\"1,500.90\"}}," +
            "{\"fullExchangeName\":\"COMEX\",\"exchangeTimezoneName\":\"America/New_York\",\"symbol\":\"SI=F\"," +
            "\"regularMarketChange\":{\"raw\":-0.046998978,\"fmt\":\"-0.05\"},\"gmtOffSetMilliseconds\":-14400000," +
            "\"headSymbolAsString\":\"SI=F\",\"exchangeDataDelayedBy\":30,\"language\":\"en\"," +
            "\"regularMarketTime\":{\"raw\":1570768558,\"fmt\":\"12:35AM EDT\"}," +
            "\"regularMarketChangePercent\":{\"raw\":-0.26700932,\"fmt\":\"-0.27%\"}," +
            "\"exchangeTimezoneShortName\":\"EDT\",\"quoteType\":\"FUTURE\",\"regularMarketPrice\":{\"raw\":17.555," +
            "\"fmt\":\"17.56\"},\"marketState\":\"REGULAR\",\"market\":\"us24_market\",\"tradeable\":false," +
            "\"exchange\":\"CMX\",\"sourceInterval\":15,\"shortName\":\"Silver\",\"region\":\"US\"," +
            "\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":17.81,\"fmt\":\"17.81\"}}," +
            "{\"fullExchangeName\":\"CCY\",\"exchangeTimezoneName\":\"Europe/London\",\"symbol\":\"EURUSD=X\"," +
            "\"regularMarketChange\":{\"raw\":0.001213789,\"fmt\":\"0.0012\"},\"gmtOffSetMilliseconds\":3600000," +
            "\"exchangeDataDelayedBy\":0,\"language\":\"en-US\",\"regularMarketTime\":{\"raw\":1570769160," +
            "\"fmt\":\"5:46AM BST\"},\"regularMarketChangePercent\":{\"raw\":0.11023444,\"fmt\":\"0.1102%\"}," +
            "\"exchangeTimezoneShortName\":\"BST\",\"quoteType\":\"CURRENCY\",\"regularMarketPrice\":{\"raw\":1" +
            ".1022928,\"fmt\":\"1.1023\"},\"marketState\":\"REGULAR\",\"market\":\"ccy_market\",\"priceHint\":4," +
            "\"tradeable\":false,\"exchange\":\"CCY\",\"currency\":\"USD\",\"sourceInterval\":15," +
            "\"shortName\":\"EUR/USD\",\"region\":\"US\",\"triggerable\":false," +
            "\"regularMarketPreviousClose\":{\"raw\":1.101079,\"fmt\":\"1.1011\"}},{\"fullExchangeName\":\"NYBOT\"," +
            "\"exchangeTimezoneName\":\"America/New_York\",\"symbol\":\"^TNX\",\"regularMarketChange\":{\"raw\":-1" +
            ".658,\"fmt\":\"-1.6580\"},\"gmtOffSetMilliseconds\":-14400000,\"exchangeDataDelayedBy\":30," +
            "\"language\":\"en\",\"regularMarketTime\":{\"raw\":1570733992,\"fmt\":\"2:59PM EDT\"}," +
            "\"regularMarketChangePercent\":{\"raw\":-100.0,\"fmt\":\"-100.00%\"}," +
            "\"exchangeTimezoneShortName\":\"EDT\",\"quoteType\":\"INDEX\",\"regularMarketPrice\":{\"raw\":1.658," +
            "\"fmt\":\"1.6580\"},\"marketState\":\"REGULAR\",\"market\":\"us24_market\",\"priceHint\":4," +
            "\"tradeable\":false,\"exchange\":\"NYB\",\"sourceInterval\":30,\"shortName\":\"10-Yr Bond\"," +
            "\"region\":\"US\",\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":1.658,\"fmt\":\"1" +
            ".6580\"},\"longName\":\"Treasury Yield 10 Years\"},{\"fullExchangeName\":\"Chicago Options\"," +
            "\"exchangeTimezoneName\":\"America/New_York\",\"symbol\":\"^VIX\",\"regularMarketChange\":{\"raw\":-18" +
            ".64,\"fmt\":\"-18.64\"},\"gmtOffSetMilliseconds\":-14400000,\"exchangeDataDelayedBy\":20," +
            "\"language\":\"en\",\"regularMarketTime\":{\"raw\":1570738494,\"fmt\":\"4:14PM EDT\"}," +
            "\"regularMarketChangePercent\":{\"raw\":-100.0,\"fmt\":\"-100.00%\"}," +
            "\"exchangeTimezoneShortName\":\"EDT\",\"quoteType\":\"INDEX\",\"regularMarketPrice\":{\"raw\":17.57," +
            "\"fmt\":\"17.57\"},\"marketState\":\"PREPRE\",\"market\":\"us_market\",\"priceHint\":2," +
            "\"tradeable\":false,\"exchange\":\"WCB\",\"sourceInterval\":15,\"shortName\":\"Vix\",\"region\":\"US\"," +
            "\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":18.64,\"fmt\":\"18.64\"}}," +
            "{\"fullExchangeName\":\"CCY\",\"exchangeTimezoneName\":\"Europe/London\",\"symbol\":\"GBPUSD=X\"," +
            "\"regularMarketChange\":{\"raw\":9.138584E-4,\"fmt\":\"0.0009\"},\"gmtOffSetMilliseconds\":3600000," +
            "\"exchangeDataDelayedBy\":0,\"language\":\"en-US\",\"regularMarketTime\":{\"raw\":1570769160," +
            "\"fmt\":\"5:46AM BST\"},\"regularMarketChangePercent\":{\"raw\":0.0734558,\"fmt\":\"0.0735%\"}," +
            "\"exchangeTimezoneShortName\":\"BST\",\"quoteType\":\"CURRENCY\",\"regularMarketPrice\":{\"raw\":1" +
            ".2449579,\"fmt\":\"1.2450\"},\"marketState\":\"REGULAR\",\"market\":\"ccy_market\",\"priceHint\":4," +
            "\"tradeable\":false,\"exchange\":\"CCY\",\"currency\":\"USD\",\"sourceInterval\":15," +
            "\"shortName\":\"GBP/USD\",\"region\":\"US\",\"triggerable\":false," +
            "\"regularMarketPreviousClose\":{\"raw\":1.2440441,\"fmt\":\"1.2440\"}},{\"fullExchangeName\":\"CCY\"," +
            "\"exchangeTimezoneName\":\"Europe/London\",\"symbol\":\"JPY=X\",\"regularMarketChange\":{\"raw\":0" +
            ".10800171,\"fmt\":\"0.1080\"},\"gmtOffSetMilliseconds\":3600000,\"exchangeDataDelayedBy\":0," +
            "\"language\":\"en-US\",\"regularMarketTime\":{\"raw\":1570769166,\"fmt\":\"5:46AM BST\"}," +
            "\"regularMarketChangePercent\":{\"raw\":0.10012488,\"fmt\":\"0.1001%\"}," +
            "\"exchangeTimezoneShortName\":\"BST\",\"quoteType\":\"CURRENCY\",\"regularMarketPrice\":{\"raw\":107" +
            ".975,\"fmt\":\"107.9750\"},\"marketState\":\"REGULAR\",\"market\":\"ccy_market\"," +
            "\"quoteSourceName\":\"Delayed Quote\",\"priceHint\":4,\"tradeable\":false,\"exchange\":\"CCY\"," +
            "\"currency\":\"JPY\",\"sourceInterval\":15,\"shortName\":\"USD/JPY\",\"region\":\"US\"," +
            "\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":107.867,\"fmt\":\"107.8670\"}}," +
            "{\"fullExchangeName\":\"CCC\",\"exchangeTimezoneName\":\"Europe/London\",\"symbol\":\"BTC-USD\"," +
            "\"regularMarketChange\":{\"raw\":79.0,\"fmt\":\"79.00\"},\"gmtOffSetMilliseconds\":3600000," +
            "\"exchangeDataDelayedBy\":0,\"language\":\"en\",\"regularMarketTime\":{\"raw\":1570769154," +
            "\"fmt\":\"5:45AM BST\"},\"regularMarketChangePercent\":{\"raw\":0.9189669,\"fmt\":\"0.92%\"}," +
            "\"exchangeTimezoneShortName\":\"BST\",\"quoteType\":\"CRYPTOCURRENCY\"," +
            "\"regularMarketPrice\":{\"raw\":8675.61,\"fmt\":\"8,675.61\"},\"marketState\":\"REGULAR\"," +
            "\"market\":\"ccc_market\",\"quoteSourceName\":\"CryptoCompare\",\"tradeable\":true,\"exchange\":\"CCC\"," +
            "\"sourceInterval\":15,\"region\":\"US\",\"triggerable\":false," +
            "\"regularMarketPreviousClose\":{\"raw\":8596.61,\"fmt\":\"8,596.61\"}},{\"fullExchangeName\":\"FTSE " +
            "Index\",\"exchangeTimezoneName\":\"Europe/London\",\"symbol\":\"^FTSE\"," +
            "\"regularMarketChange\":{\"raw\":19.859863,\"fmt\":\"19.86\"},\"gmtOffSetMilliseconds\":3600000," +
            "\"exchangeDataDelayedBy\":15,\"language\":\"en\",\"regularMarketTime\":{\"raw\":1570721730," +
            "\"fmt\":\"4:35PM BST\"},\"regularMarketChangePercent\":{\"raw\":0.27712083,\"fmt\":\"0.28%\"}," +
            "\"exchangeTimezoneShortName\":\"BST\",\"quoteType\":\"INDEX\",\"regularMarketPrice\":{\"raw\":7186.36," +
            "\"fmt\":\"7,186.36\"},\"marketState\":\"PREPRE\",\"market\":\"gb_market\",\"priceHint\":2," +
            "\"tradeable\":false,\"exchange\":\"FGI\",\"sourceInterval\":15,\"shortName\":\"FTSE 100\"," +
            "\"region\":\"US\",\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":7166.5,\"fmt\":\"7,166" +
            ".50\"}},{\"fullExchangeName\":\"Osaka\",\"exchangeTimezoneName\":\"Asia/Tokyo\",\"symbol\":\"^N225\"," +
            "\"regularMarketChange\":{\"raw\":234.33008,\"fmt\":\"234.33\"},\"gmtOffSetMilliseconds\":32400000," +
            "\"exchangeDataDelayedBy\":0,\"language\":\"en\",\"regularMarketTime\":{\"raw\":1570767965," +
            "\"fmt\":\"1:26PM JST\"},\"regularMarketChangePercent\":{\"raw\":1.0872786,\"fmt\":\"1.09%\"}," +
            "\"exchangeTimezoneShortName\":\"JST\",\"quoteType\":\"INDEX\",\"regularMarketPrice\":{\"raw\":21786.31," +
            "\"fmt\":\"21,786.31\"},\"marketState\":\"REGULAR\",\"market\":\"jp_market\",\"priceHint\":2," +
            "\"tradeable\":false,\"exchange\":\"OSA\",\"sourceInterval\":20,\"shortName\":\"Nikkei 225\"," +
            "\"region\":\"US\",\"triggerable\":false,\"regularMarketPreviousClose\":{\"raw\":21551.98,\"fmt\":\"21," +
            "551.98\"}}],\"error\":null}}";
}
