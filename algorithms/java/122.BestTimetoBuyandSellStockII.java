class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int max =0, i = 0, j = 1;

        while(j < prices.length){
            if(prices[j] >= prices[i]){
                max += prices[j] - prices[i];
            }
            j++;
            i++;
        }
        return max;
    }
}