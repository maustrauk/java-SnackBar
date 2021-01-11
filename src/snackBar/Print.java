package snackBar;

public class Print {
    private Customer person;
    private Snack food;

    public Print (
        Customer person,
        Snack food
    ) {
        this.person = person;
        this.food = food;
    }

    public void printMVP(int type) {
        if (type == 0 || type == 1) {
            System.out.println(this.person.getName() + " cash on hand " + this.person.getCashOnHand());
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
}
