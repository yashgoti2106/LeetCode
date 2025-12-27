class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int maxpf=0;
        for(int i = 0; i < n; i++) {
          if(prices[i] <minPrice) {
                minPrice= prices[i];
          }else {
            maxpf=Math.max(maxpf,prices[i]-minPrice);
          }
        }
        return maxpf;
    }
}