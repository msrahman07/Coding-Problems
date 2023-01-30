package TradingSystem;

import java.math.BigDecimal;

public class Order {
    String symbol;
    boolean bid;
    boolean ask;
    boolean completed = false;
    BigDecimal price;
    long amount;

    // constructing order based on symbol, buy/sell, price and amount
    Order(String s, boolean b, boolean a, BigDecimal p, long am) {
        symbol = s;
        bid = b;
        ask = a;
        price = p;
        amount = am;
    }
}