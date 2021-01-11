package snackBar;

import java.text.DecimalFormat;

public class Print {
    private Customer person;
    private Snack food;
    private String[] vendingMashine = {"Food", "Drink", "Office"};
    private String doubleFormatter(double input) {
        String pattern = "$###,###.###";
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        return myFormatter.format(input);
    }

    public Print (
        Customer person,
        Snack food
    ) {
        this.person = person;
        this.food = food;
    }

    public void printMVP(int type) {
        if (type == 0 || type == 1) {
            System.out.println(this.person.getName() + " cash on hand " + this.doubleFormatter(this.person.getCashOnHand()));
        }
        if (type == 0 || type == 2) {
            System.out.println("Quantity of " + this.food.getName() + " is " + this.food.getQuantity());
        }
        System.out.println("");
    }

    public void setObj (Customer person, Snack food) {
        this.person = person;
        this.food = food;
    }

    public void printStretch(Snack snack) {
        System.out.println("Snack: " + snack.getName());
        System.out.println("Vending Machine: " + this.vendingMashine[snack.getVendingMachineId() - 1]);
        System.out.println("Quantity: " + snack.getQuantity());
        System.out.println("Total Cost: " + this.doubleFormatter(snack.getTotalcost()));
        System.out.println("");
    }
}
