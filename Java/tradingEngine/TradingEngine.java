package tradingEngine;

import java.util.HashMap;

import customCollection.CustomQueue;
import customCollection.Node;

public class TradingEngine {

    HashMap<String, BookEntry> orderBook = new HashMap<>();

    public void handleOrder(Order newOrder) {
    	matchOrder(newOrder);
    }
    
    private void matchOrder(Order newOrder) {
        // Check order if sell/buy and match against bid/ask lists
        if(!orderBook.containsKey(newOrder.symbol)) {
        	addNewOrder(newOrder);
        	return;
        }
        	
        if(newOrder.bid) { // buy order
            Node<Order> askHead = orderBook.get(newOrder.symbol).asksList.getHead();

            while(askHead != null && newOrder.amount > 0) {
                if(newOrder.price.compareTo(askHead.getData().price) >= 0) {
                	compareAmountOfOrders(newOrder, askHead, orderBook.get(newOrder.symbol).asksList);
                }
                if(askHead != null) {
                	askHead = askHead.getNext();
                }
                
            }
        } else { // sell order
        	Node<Order> bidHead = orderBook.get(newOrder.symbol).bidsList.getHead();
        	while(bidHead != null && newOrder.amount > 0) {
                if(newOrder.price.compareTo(bidHead.getData().price) <= 0) {
                	compareAmountOfOrders(newOrder, bidHead, orderBook.get(newOrder.symbol).bidsList);
                }
                if(bidHead != null) {
                	bidHead = bidHead.getNext();	
                }
                
            }
        }
        // if newOrder.amount still > 0, add to book ======== add code here
        if(newOrder.amount > 0) addNewOrder(newOrder);
    }

    private void compareAmountOfOrders(Order newOrder, Node<Order> listHead,
    		CustomQueue<Order> orderList) {
    	if(newOrder.amount < listHead.getData().amount) {
            listHead.getData().amount -= newOrder.amount;
            newOrder.amount = 0;
            // Add filled order to completed list
//            orderBook.get(newOrder.symbol).completedList.addLast(newOrder);
        } else if(newOrder.amount > listHead.getData().amount){
            newOrder.amount -= listHead.getData().amount;
            listHead.getData().amount = 0;
            // Add filled order to completed list
//            orderBook.get(newOrder.symbol).completedList.addLast(listHead.getData());
            orderList.removeCurrentElement(listHead);
        } else {
            newOrder.amount = 0;
            listHead.getData().amount = 0;
//            orderBook.get(newOrder.symbol).completedList.addLast(listHead.getData());
//            orderBook.get(newOrder.symbol).completedList.addLast(newOrder);
            orderList.removeCurrentElement(listHead);
        }
    }
    
    private void addNewOrder(Order newOrder) {
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
