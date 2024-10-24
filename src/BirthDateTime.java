import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int min = 0;
        int highR = 0;

        year = SafeInput.getRangedInt(in, "Enter birth year", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter birth month", 1, 12);
        switch (month){
            case 2:
                highR = 29;
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                highR = 31;
                break;
            case 4: case 6: case 9: case 11:
                highR = 30;
                break;
        }
        day = SafeInput.getRangedInt(in, "Enter birth day", 1, highR);
        hour = SafeInput.getRangedInt(in, "Enter birth hour", 1, 24);
        min = SafeInput.getRangedInt(in, "Enter birth minute", 1, 59);
        System.out.println("You were born on " + month + "/" + day + "/" + year + " at " + hour + ":" + min);
    }
}
