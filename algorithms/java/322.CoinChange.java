class Solution {
    public int coinChange(int[] coins, int amount) {
    
        if(amount == 0) return 0;
        
        int dp[] = new int[amount + 1];
        for(int i = 1; i < dp.length; i++){
            dp[i] = Integer.MAX_VALUE - 1;
            for(int j = 0; j < coins.length; j++){
                if(coins[j] <= i ){
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                } 
            }
        }
        
       if(dp[amount] == Integer.MAX_VALUE - 1){
          return -1;
       } else{
          return dp[amount];
       }
    }
}
