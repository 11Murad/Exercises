import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getResult());
    }
    public static int getResult() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    result += matrix[i][j] + matrix[i][matrix.length - j - 1];
                    break;
                }
            }
        }
        if (matrix.length % 2 == 1) {
            result -= matrix[matrix.length / 2][matrix.length / 2];
        }
        return result;
    }
}
