import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = getNonZeroLenString(in,"Enter your name");
        System.out.println("Your name is: " + name);
    }

    /**
     * Gets a non-0 length string from user
     * @param pipe scanner to use to read the input
     * @param prompt prompt to tell the user what to input
     * @return String that is at least one character
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retVal = "";

        do {
            System.out.println(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.isEmpty()){
                System.out.println("You must enter at least one character!");
            }
        }while(retVal.isEmpty());

        return retVal;
    }
}