package VendingMachine;

public enum Item {
    COKE("Coke", 150),
    PEPSI("Pepsi", 150),
    FANTA("Fanta", 150);
    
    private final String name;
    private final int price;
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }

    private Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
