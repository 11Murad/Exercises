import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit n:");
        int n = sc.nextInt();
        System.out.println("Enter the digit m:");
        int m = sc.nextInt();
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}