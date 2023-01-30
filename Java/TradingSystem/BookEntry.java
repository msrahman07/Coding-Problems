package TradingSystem;

import java.util.LinkedList;

public class BookEntry {
    //queue of bids
    LinkedList<Order> bidsList = new LinkedList<Order>();
    //queue of asks
    LinkedList<Order> asksList = new LinkedList<Order>();
    //queue of completed
    LinkedList<Order> completedList = new LinkedList<Order>();
}
