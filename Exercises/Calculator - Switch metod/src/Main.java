import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = InputUtil.reqemiTelebEt("a-ni daxil edin");
        double b = InputUtil.reqemiTelebEt("b-ni daxil edin");
        char operation = InputUtil.simvoluTelebEt("Emeliyyatı daxil edin: +, -, *, /.");
        double result = MathUtil.hesabla(a,b,operation);

        System.out.println("Netice: " + result);
    }

}
