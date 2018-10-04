package org.array.easy;

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++){
            for (int j = i + 1; j < prices.length; j++){
                if (prices[j] > prices[i]){
                    int temp = prices[j] - prices[i];
                    if (temp > maxProfit){
                        maxProfit = temp;
                    }
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int rs = new BestTimetoBuyandSellStock().maxProfit(prices);
        System.out.println(rs);
    }

}
