public class stockBuyAndSell {
    public static int buyAndSell(int[] price) {
        int maxProfit = 0, bestBuy = price[0];

        for (int i = 1; i < price.length; i++) {
            if (price[i] > bestBuy) {
                maxProfit = Math.max(maxProfit, price[i] - bestBuy);
            }
            bestBuy = Math.min(bestBuy, price[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSell(arr));

    }
}
