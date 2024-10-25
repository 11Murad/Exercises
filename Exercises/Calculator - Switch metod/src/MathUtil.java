import java.util.Scanner;

public class MathUtil {


    public static double hesabla(double a, double b, char operation) {

        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
                default:
                    return 0;
        }
    }
}
