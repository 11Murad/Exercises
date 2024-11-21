import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();

        char[] ascending = s.toCharArray();
        Arrays.sort(ascending);
        String ascendingOrder = new String(ascending);

        StringBuilder descendingOrder = new StringBuilder(ascendingOrder).reverse();

        System.out.println(ascendingOrder);
        System.out.println(descendingOrder);
    }
}