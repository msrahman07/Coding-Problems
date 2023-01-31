package tradingEngine;

import java.math.BigDecimal;
import java.util.ArrayList;
import customCollection.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TradingEngine te = new TradingEngine();
		
		ArrayList<Order> orderList = new ArrayList<Order>();
		orderList.add(new Order("AAPL", false, true, new BigDecimal("5.09"), 250));
		orderList.add(new Order("AAPL", true, false, new BigDecimal("5.61"), 150));
		orderList.add(new Order("AAPL", true, false, new BigDecimal("5.71"), 170));
		orderList.add(new Order("AAPL", false, true, new BigDecimal("5.71"), 240));
		orderList.add(new Order("AAPL", true, false, new BigDecimal("5.71"), 200));
		orderList.add(new Order("AAPL", false, true, new BigDecimal("5.6"), 100));
		orderList.add(new Order("AAPL", false, true, new BigDecimal("5.7"), 110));
		orderList.add(new Order("AAPL", false, true, new BigDecimal("5.4"), 150));
		orderList.add(new Order("AAPL", true, false, new BigDecimal("5.2"), 200));
		orderList.add(new Order("AAPL", true, false, new BigDecimal("5.45"), 130));
		orderList.add(new Order("AAPL", false, true, new BigDecimal("5.09"), 250));
		orderList.add(new Order("AAPL", true, false, new BigDecimal("5.61"), 150));
		orderList.add(new Order("AAPL", true, false, new BigDecimal("5.71"), 170));
		orderList.add(new Order("AAPL", false, true, new BigDecimal("5.71"), 240));
		orderList.add(new Order("AAPL", true, false, new BigDecimal("5.71"), 200));
		orderList.add(new Order("AAPL", false, true, new BigDecimal("5.71"), 20));
		orderList.add(new Order("AAPL", false, true, new BigDecimal("5.61"), 10));
		orderList.add(new Order("AAPL", false, true, new BigDecimal("5.61"), 10));
		orderList.add(new Order("AAPL", false, true, new BigDecimal("5.61"), 10));
		orderList.add(new Order("AAPL", false, true, new BigDecimal("5.71"), 20));
		orderList.add(new Order("AAPL", true, false, new BigDecimal("5.71"), 200));
		
		
		for(Order o : orderList) {
			te.handleOrder(o);
		}
		
		System.out.println("Sell/Ask list: ");
		
		Node<Order> tempAsk = te.orderBook.get("AAPL").asksList.getHead();
		while(tempAsk != null) {
			System.out.println("Price: $" + tempAsk.getData().price +" Amount: " + tempAsk.getData().amount);
			tempAsk = tempAsk.getNext();
		}

		System.out.println("\nBuy/Bid list: ");		

		Node<Order> tempBid = te.orderBook.get("AAPL").bidsList.getHead();
		while(tempBid != null) {
			System.out.println("Price: $" + tempBid.getData().price +" Amount: " + tempBid.getData().amount);
			tempBid = tempBid.getNext();
		}
//		System.out.println(te.orderBook.get("AAPL").asksList.getHead().getData().price);

	}

}
