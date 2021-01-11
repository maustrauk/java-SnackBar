package snackBar;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer (
        String name,
        double cash
    ) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cash;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void addToCashOnHand(double cash) {
        this.cashOnHand = this.cashOnHand + cash;
    }

    public void buySnacks(int quantity, double price) {
        this.cashOnHand -= quantity * price;
    }
}
