package tradingEngine;

import customCollection.CustomQueue;

public class BookEntry {
    //queue of bids
    CustomQueue<Order> bidsList = new CustomQueue<Order>();
    //queue of asks
    CustomQueue<Order> asksList = new CustomQueue<Order>();
    //queue of completed
    CustomQueue<Order> completedList = new CustomQueue<Order>();
}
