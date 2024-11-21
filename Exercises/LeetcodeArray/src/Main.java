import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums ={2,2,1,1,1,1,1,2,5,5,5,5,5};
        Arrays.sort(nums);
        System.out.println(majorityElement(nums));
//        int[] nums = {1,1,1,2,2,2,2}
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length/2;
        Arrays.sort(nums);

        return nums[n];
    }
}