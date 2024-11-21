import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        scanner.close();

        int length = number.length();

        char lastDigit = number.charAt(length - 1);
        System.out.println((lastDigit - '0') % 2 == 0 ? "Yes" : "No");

        int lastTwo = (length == 1) ? lastDigit - '0' : Integer.parseInt(number.substring(length - 2));
        System.out.println(lastTwo % 4 == 0 ? "Yes" : "No");

        int lastThree = (length <= 2) ? Integer.parseInt(number) : Integer.parseInt(number.substring(length - 3));
        System.out.println(lastThree % 8 == 0 ? "Yes" : "No");
    }
}
