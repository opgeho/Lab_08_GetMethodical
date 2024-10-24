import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String SSN = "";
        String mNum = "";
        String choice = "";

        SSN = SafeInput.getRegExString(in, "Enter SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        mNum = SafeInput.getRegExString(in, "Enter your m number", "^(M|m)\\d{5}$");
        choice = SafeInput.getRegExString(in, "Enter your menu choice", "^[OoSsVvQq]$");

        System.out.println("Your SSN is: " + SSN);
        System.out.println("Your M number is: " + mNum);
        if (choice.equalsIgnoreCase("O")){
            System.out.println("You chose to open.");
        }
        else if (choice.equalsIgnoreCase("S")){
            System.out.println("You chose to save.");
        }
        else if (choice.equalsIgnoreCase("V")){
            System.out.println("You chose to view.");
        }
        else if (choice.equalsIgnoreCase("Q")){
            System.out.println("You chose to quit.");
        }

    }
}
