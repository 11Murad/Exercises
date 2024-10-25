import java.util.Scanner;

public class InputUtil {


    public static double reqemiTelebEt(String mesaj) {
        System.out.println(mesaj);
        return new Scanner(System.in).nextDouble();
    }

    public static char simvoluTelebEt(String mesaj) {
        System.out.println(mesaj);
        return new Scanner(System.in).next().charAt(0);
    }
}
