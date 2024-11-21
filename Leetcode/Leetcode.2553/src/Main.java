public class Main {
    public static void main(String[] args) {
        int[] nums = {13,25,83,77};

    }
    public static int[] separateDigits(int[] nums) {
       int counter = 0;

       for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            while (temp > 0) {
                temp/=10;
                counter++;
            }
       }
       int[] arr = new int[counter];
       for (int i = nums.length-1; i >= 0; i--) {
           int temp = nums[i];
           while (nums[i] > 0) {
               arr[--counter] = nums[i] % 10;
               nums[i] /= 10;
           }
       }
       return arr;
    }
}