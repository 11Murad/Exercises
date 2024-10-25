import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("min of arr array is:");
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i+1; j < n; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                    System.out.println(min);
                }
            }
            int b = arr[i];
            arr[i] = min;
            arr[minIndex] = b;
        }
    }
}