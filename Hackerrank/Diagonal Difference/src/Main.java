import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<List<Integer>> list = List.of(List.of(1,2,3), List.of(4,5,6), List.of(9,8,9));
       int result =  diagonalDifference(list);
        System.out.println(result);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) {
                    leftSum += arr.get(i).get(j);
                    rightSum += arr.get(i).get(arr.size() - j - 1);
                }
            }
        }
        return Math.abs(leftSum - rightSum);
    }
}