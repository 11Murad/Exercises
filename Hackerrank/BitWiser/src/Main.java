import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5,};
        int[] arr2 = {1, 2, 3, 4, 6, 5,};
        int[] arr3 = new int[6];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if ((arr[i] ^ arr2[i]) != 0) ;
                arr3[j] = arr2[i];
            }
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}