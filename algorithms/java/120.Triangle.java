class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(n - 1).size();
        int[][] dp = new int[n][m];
        
        dp[0][0] = triangle.get(0).get(0);
        
        //列边界
        for(int i = 1; i < n; i++){
            dp[i][0] = dp[i-1][0] + triangle.get(i).get(0);
        }
        
        //斜对角边界
        for(int i = 1; i < n; i++){
            dp[i][i] = dp[i-1][i-1] + triangle.get(i).get(i);
        }
        
        //一般情况，自顶而下
        for(int i = 1; i < n; i++){
            for(int j = 1; j < triangle.get(i).size() - 1; j++){
                dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]) + triangle.get(i).get(j);
            }
        }
        
        //遍历得出最小值
        int min = dp[n - 1][0];
        for(int i = 1; i < m; i++){
            min = dp[n - 1][i] > min ? min : dp[n - 1][i];
        }
        return min ;
    }
}

一维数组
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int dp[] = new int[n + 1];
        
        //在原数组上改动，自下而上
        for(int i = n - 1; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}

