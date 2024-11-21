public class Main {
    public static void main(String[] args) {
        int [] prices = {7,9,6,5,4,3,2,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i+1] - prices[i]>0) {
                maxProfit += prices[i+1] - prices[i];
            }
        }
        return maxProfit;
    }
}