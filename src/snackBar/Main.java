package snackBar;

public class Main {
    public static void main(String[] args) {
        System.out.println("My Snack Bar Project");
        Customer person1 = new Customer("Jane", 37.75);
        Snack snack1 = new Snack("Soda", 21, 2.5, 1);
        System.out.println(person1.getName() + " cash on hand " + String.valueOf(person1.getCashOnHand()));
        System.out.println(snack1.getName() + " prise is " + snack1.getCost());
    }
}