public class Main {
    public static void main(String[] args) {
        int plusCount = 0;
        int minusCount = 0;
        int zeroCount = 0;
        int[] arr = {1, 1, 0, -1, -10};
        for (int i : arr) {
            if (i > 0) plusCount++;
            else if (i < 0) minusCount++;
            else if (i == 0) zeroCount++;
        }
        double c = plusCount / (double) arr.length;
        double m = minusCount / (double) arr.length;
        double z = zeroCount / (double) arr.length;
        System.out.println(c);
        System.out.println(m);
        System.out.println(z);
    }
}