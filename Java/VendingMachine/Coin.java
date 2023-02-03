package VendingMachine;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    private final int value;

    public int getValue() {
        return value;
    }

    private Coin(int value) {
        this.value = value;
    }

}
