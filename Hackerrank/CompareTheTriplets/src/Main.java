public class Main {
    public static void main(String[] args) {
        staircase(10);

    }

    public static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j<n-i-1)
                System.out.print(" ");
                else if (j>=n-i-1) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

}