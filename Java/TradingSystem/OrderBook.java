package TradingSystem;

import java.util.HashMap;

public class OrderBook {
    HashMap<String, BookEntry> book = new HashMap<>();

    public void addNewOrder(Order newOrder) {
        if(book.containsKey(newOrder.symbol)) {
            if(newOrder.bid) {
                book.get(newOrder.symbol).bidsList.addLast(newOrder);
            } else {
                book.get(newOrder.symbol).asksList.addLast(newOrder);
            }
        } 
        else {
            book.put(newOrder.symbol, new BookEntry());
        }
    }
}