import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 1, 1, 9};
        System.out.println(Arrays.toString(continuationSort(arr)));
        System.out.println(Arrays.toString(arr));
    }

    public static int[] continuationSort(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                max = arr[i];
            }
        }
        int[] newArr = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i < newArr.length; i++) {

            while (newArr[i] > 0) {
                arr[index++] = i;
                newArr[i]--;
            }
        }
        return newArr;
    }
}