package snackBar;

public class Main {
    public static void main(String[] args) {



        System.out.println("My Snack Bar Project");
        
        
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, 0);
        Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, 0);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, 0);
        Snack soda = new Snack("Soda", 24, 2.50, 1);
        Snack water = new Snack("Water", 20, 2.75, 1);

        Print print = new Print(jane, soda);

        System.out.println("");
        System.out.println("MVP:");
        System.out.println("");

        jane.buySnacks(3, soda.getCost());
        soda.buy(3);
        print.setObj(jane, soda);
        print.printMVP(0);

        jane.buySnacks(1, pretzel.getCost());
        pretzel.buy(1);
        print.setObj(jane, pretzel);
        print.printMVP(0);

        bob.buySnacks(2, soda.getCost());
        soda.buy(2);
        print.setObj(bob, soda);
        print.printMVP(0);

        jane.addToCashOnHand(10.00);
        print.setObj(jane, soda);
        print.printMVP(1);

        jane.buySnacks(1, chocolate.getCost());
        chocolate.buy(1);
        print.setObj(jane, chocolate);
        print.printMVP(0);

        pretzel.addQuantity(12);
        print.setObj(jane, pretzel);
        print.printMVP(2);

        bob.buySnacks(3, pretzel.getCost());
        pretzel.buy(3);
        print.setObj(bob, pretzel);
        print.printMVP(0);
    }
}