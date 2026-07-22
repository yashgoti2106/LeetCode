class Solution {
    public int maxProfit(int[] prices) {
       int profit = 0;
       int n = prices.length;
       int buydate = prices[0];
       for(int i = 0; i < n; i++) {
       // int buydate = i;
        if(prices[i] < buydate) {
            buydate = prices[i];    
        } else {
            profit = Math.max(profit,prices[i] - buydate);
        }
       } return profit;
    }
}