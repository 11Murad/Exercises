public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(sumArray(arr));
    }
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}