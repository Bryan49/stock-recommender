package stock.recommender.pojo;

public class StockRecommenderException extends Exception {
     static final long serialVersionUID = 48123323543L;

    /**
     * Constructs a <code>StockRecommenderException</code> with no detail message.
     */
    public StockRecommenderException () {
        super();
    }

    /**
     * Constructs a <code>StockRecommenderException</code> with the
     * specified detail message.
     *
     * @param   s   the detail message.
     */
    public StockRecommenderException (String s) {
        super (s);
    }
}

