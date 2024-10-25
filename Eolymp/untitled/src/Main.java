import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =3;
        System.out.println("Enter the digit m:");
        int m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i==0 || i==2){
                    System.out.print("*");
                }
                else if (j==0 || j==m-1){
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}