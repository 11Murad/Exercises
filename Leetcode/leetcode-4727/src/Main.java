import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str = "fooffort";
        capEt(str);
    }

    public static void capEt(String str) {
        int firtIndex = -2;
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'f') {
                firtIndex++;
                index = i;
                break;
            }
        }
        int secondIndex = -1;
        for (int i = ++index; i < str.length(); i++) {
            if (str.charAt(i) == 'f') {
                secondIndex = i;
                break;
            }
        }
        if (secondIndex >0) {
            firtIndex=-5;
        }
        if (firtIndex == -2) {
            System.out.println("-2");
        } else if (firtIndex == -1) {
            System.out.println(-1);
        } else if (secondIndex > 0) {
            System.out.println(secondIndex);
        }
    }
}