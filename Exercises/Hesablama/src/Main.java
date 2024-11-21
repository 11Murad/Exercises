public class Main {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(qaytarProfit(prices));

    }

    public static int qaytarProfit(int[] prices) {
        int k = 0;
        int minINdex =0;
        int min=0;
       int maxI = maxQaytar(prices);
        for (int i = maxI; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                minINdex = k;
            }
        }

        return prices[maxI] - prices[k];
    }

    public static int maxQaytar(int[] prices) {
        int maxIndex = 0;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}