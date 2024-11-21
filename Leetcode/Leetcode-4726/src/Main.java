import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Text daxil edin");
        String str = new Scanner(System.in).nextLine();
        capEt(str);
    }

    public static void capEt(String str) {
        int firtIndex = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'f') {
                firtIndex = 0;
                break;
            }
        }
        int secondIndex = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'f') {
                secondIndex = i;
                break ;
            }
        }
        if (firtIndex == -1) {
            System.out.println("");
        } else if (secondIndex == firtIndex) {
            System.out.println(firtIndex);
        }
        else System.out.println(firtIndex + " " + secondIndex);
    }
}