package LeetCode75and150.ArraysStrings;

public class BestTimeToBuyAndSellStocks {

    static int buyAndSellStocks(int[] prices){
        if(prices.length == 0 || prices == null) return 0;
        int profit = 0;
        int min_price = prices[0];

        for(int i=0; i < prices.length; i++){
            min_price = Math.min(min_price,prices[i]);
            profit = Math.max(profit,prices[i]-min_price);
        }
        return profit;
    }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
    }
}
