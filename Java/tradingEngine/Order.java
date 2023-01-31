package tradingEngine;
import java.math.BigDecimal;

public class Order {
    String symbol;
    boolean bid;
    boolean ask;
    boolean completed = false;
    BigDecimal price;
    long amount;

    // constructing order based on symbol, buy/sell, price and amount
    Order(String symbol, boolean bid, boolean ask, BigDecimal price, long amount) {
        this.symbol = symbol;
        this.bid = bid;
        this.ask = ask;
        this.price = price;
        this.amount = amount;
    }
}