package snackBar;

public class Main {
    public static void main(String[] args) {



        System.out.println("My Snack Bar Project");
        
        
        Customer jane = new Customer("Jane", 37.75);
        Customer bob = new Customer("Bob", 28.14);

        Snack soda = new Snack("Soda", 21, 2.5, 1);
        Snack pretzel = new Snack("Pretzel", 29, 2, 1);
        Snack chocolate = new Snack("Chocolate Bar", 35, 1, 2);

        System.out.println("");
        System.out.println("MVP:");
        System.out.println("");

        Print print = new Print(jane, soda);
        
        print.printMVP(0);

        print.setSnack(pretzel);
        print.printMVP(0);

        print.setPerson(bob);
        soda.addQuantity(19 - soda.getQuantity());
        print.setSnack(soda);
        print.printMVP(0);

        jane.addToCashOnHand(45.75 -jane.getCashOnHand());
        print.setPerson(jane);
        print.printMVP(1);

        jane.addToCashOnHand(44.75 - jane.getCashOnHand());
        print.setSnack(chocolate);
        print.printMVP(0);

        pretzel.addQuantity(41 - pretzel.getQuantity());
        print.setSnack(pretzel);
        print.printMVP(2);

        bob.addToCashOnHand(22.14 - bob.getCashOnHand());
        pretzel.addQuantity(38 - pretzel.getQuantity());
        print.setPerson(bob);
        print.setSnack(pretzel);
        print.printMVP(0);
    }
}