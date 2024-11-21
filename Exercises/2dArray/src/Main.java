public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};

    }

    public boolean search(int[] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[mid] == target) {
                return true;
            } else if (matrix[mid] > target) {
                right = mid - 1;
            } else if (matrix[mid] < target) {
                left = mid + 1;
            }
        }
        return false;
    }

    public  boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (search(matrix[i],target)) {
                return true;
            }
        }
        return false;
    }
}
