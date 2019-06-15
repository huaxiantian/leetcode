class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int dp[] = new int[prices.length];
        int min = prices[0];
        int max = 0;

        for(int i = 0; i < prices.length; i++){
            dp[i] = prices[i] - min;
            min = min > prices[i] ? prices[i] : min;
            max = max > dp[i] ? max : dp[i];
        }
        return max;
    }
}