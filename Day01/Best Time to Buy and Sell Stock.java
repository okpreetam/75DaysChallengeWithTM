// Question Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Hint From: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/1735493/JavaC%2B%2B-best-ever-EXPLANATION-could-possible

class Solution {
    public int maxProfit(int[] prices) {
        //TC: O(N) SC: O(1)

        int lowestPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < lowestPrice)
                lowestPrice = prices[i];

            if(maxProfit < prices[i] - lowestPrice)
                maxProfit = prices[i] - lowestPrice;
        }

        return maxProfit;
    }
}