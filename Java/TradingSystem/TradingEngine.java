package TradingSystem;

import java.util.HashMap;
import java.util.ListIterator;

public class TradingEngine {

    public TradingEngine() {
    }
    HashMap<String, BookEntry> orderBook = new HashMap<>();

    public boolean matchOrder(Order newOrder) {
        // Check order if sell/buy and match against bid/ask lists
        if(!orderBook.containsKey(newOrder.symbol)) return false;

        if(newOrder.bid) { // buy order
            ListIterator<Order> askItr = orderBook.get(newOrder.symbol).asksList.listIterator();
            while(askItr.hasNext()) {
                if(newOrder.price.compareTo(askItr.next().price) >= 0) {
                    if(newOrder.amount < askItr.next().amount) {
                        newOrder.amount = 0;
                        askItr.next().amount -= newOrder.amount;
                        orderBook.get(newOrder.symbol).completedList.addLast(newOrder);
                        break;
                    } else if(newOrder.amount > askItr.next().amount){
                        newOrder.amount -= askItr.next().amount;
                        askItr.next().amount = 0;
                        orderBook.get(newOrder.symbol).completedList.addLast(askItr.next());
                        askItr.remove();
                    } else {
                        newOrder.amount = 0;
                        askItr.next().amount = 0;
                        orderBook.get(newOrder.symbol).completedList.addLast(askItr.next());
                        orderBook.get(newOrder.symbol).completedList.addLast(newOrder);
                        askItr.remove();
                        break;
                    }
                }
            }
            // if newOrder.amount still > 0, add to book ======== add code here
            if(newOrder.amount > 0) addNewOrder(newOrder);

        } else { // sell order
            ListIterator<Order> bidItr = orderBook.get(newOrder.symbol).bidsList.listIterator();
            while(bidItr.hasNext()) {
                if(newOrder.price.compareTo(bidItr.next().price) <= 0) {
                    if(newOrder.amount < bidItr.next().amount) {
                        newOrder.amount = 0;
                        bidItr.next().amount -= newOrder.amount;
                        orderBook.get(newOrder.symbol).completedList.addLast(newOrder);
                        break;
                    } else if(newOrder.amount > bidItr.next().amount){
                        newOrder.amount -= bidItr.next().amount;
                        bidItr.next().amount = 0;
                        orderBook.get(newOrder.symbol).completedList.addLast(bidItr.next());
                        bidItr.remove();
                    } else {
                        newOrder.amount = 0;
                        bidItr.next().amount = 0;
                        orderBook.get(newOrder.symbol).completedList.addLast(bidItr.next());
                        orderBook.get(newOrder.symbol).completedList.addLast(newOrder);
                        bidItr.remove();
                        break;
                    }
                }
            }
        }
        return false;
    }

    public void addNewOrder(Order newOrder) {
        if(orderBook.containsKey(newOrder.symbol)) {
            if(newOrder.bid) {
                orderBook.get(newOrder.symbol).bidsList.addLast(newOrder);
            } else {
                orderBook.get(newOrder.symbol).asksList.addLast(newOrder);
            }
        } 
        else {
            orderBook.put(newOrder.symbol, new BookEntry());
            addNewOrder(newOrder);
        }
    }
}
