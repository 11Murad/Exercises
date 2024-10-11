import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random1 = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random1.nextInt(-100, 100);
        }

        int countPlusAdd = 0;
        int countMinusAdd = 0;
        int countPlusEven = 0;
        int countMinusEven = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                countPlusAdd++;
            } else if (arr[i] % 2 != 0 && arr[i] < 0) {
                countMinusAdd++;
            } else if (arr[i] % 2 == 0 && arr[i] > 0) {
                countPlusEven++;
            } else if (arr[i] % 2 == 0 && arr[i] < 0) {
                countMinusEven++;
            }
        }
        System.out.println("Musbet teklerin sayi: " + countPlusAdd);
        System.out.println("Menfi teklerin sayi: " + countMinusAdd);
        System.out.println("Musbet cutlerin sayi: " + countPlusEven);
        System.out.println("Menfi cutlerin sayi: " + countMinusEven);

        int[] arr1 = new int[countPlusAdd];
        int[] arr2 = new int[countMinusAdd];
        int[] arr3 = new int[countPlusEven];
        int[] arr4 = new int[countMinusEven];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                arr1[--countPlusAdd] = arr[i];
            }
            if (arr[i] % 2 != 0 && arr[i] < 0) {
                arr2[--countMinusAdd] = arr[i];
            }
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                arr3[--countPlusEven] = arr[i];
            }
            if (arr[i] % 2 == 0 && arr[i] < 0) {
                arr4[--countMinusEven] = arr[i];
            }
        }
        print(arr1);
        print(arr2);
        print(arr3);
        print(arr4);
    }

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}

