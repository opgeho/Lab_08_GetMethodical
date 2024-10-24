
public class CtoFTableDisplay {
    public static void main(String[] args) {
        for(double c = -100; c <= 100; c++ ){
            System.out.printf("%.2f is %.2f \n", c, CtoF(c));
        }
    }
    public static double CtoF(double celsius){
        double retVal = 0;
        retVal = (celsius * 9.0 / 5) + 32;
        return retVal;
    }
}
