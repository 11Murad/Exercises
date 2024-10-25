import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Text-i daxil edin:");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        char[] inputs=input.toLowerCase().toCharArray();
//        for(int i=0; i<inputs.length; i++){
//            if(inputs[i]<='A'||inputs[i]>='Z'){
//
//            }
//        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Sort of arr array is:");

        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }
//        int[] arr = {1,2,3,4,5};// 1 , 4
//        int swap = 0;
//        swap = arr[4];//5
//        arr[4]=arr[1];//2
//        arr[1]=swap;//5
    }
}
