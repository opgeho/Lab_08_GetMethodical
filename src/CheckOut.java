import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double MIN_PRICE = 0.5;
        final double MAX_PRICE = 10.0;
        double price = 0;
        boolean done = false;

        do {
            price += SafeInput.getRangedDouble(in, "Enter item price", MIN_PRICE, MAX_PRICE);
            done = SafeInput.getYNConfirm(in, "Are you done shopping");
        }while (!done);
        System.out.printf("your total is  %.2f", price);

    }
}
