import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = reqemiTelebEt("a-ni daxil edin");
        double b = reqemiTelebEt("b-ni daxil edin");
        char operation =simvoluTelebEt("Emeliyyatı daxil edin: +, -, *, /.");

        double result = 0;

        if (operation == '+') {
            result = a + b;
        }
        else if (operation == '-') {
            result = a - b;
        }
        else if (operation == '*') {  
            result = a * b;
        }
        else if (operation == '/') {
            result = a / b;
        }
        System.out.println("Netice: "+ result);
    }
    public static double reqemiTelebEt(String mesaj){
        System.out.println(mesaj);
        return new Scanner(System.in).nextDouble();
    }
    public static char simvoluTelebEt(String mesaj){
        System.out.println(mesaj);
        return new Scanner(System.in).next().charAt(0);
    }
}
