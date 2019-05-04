class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, dp = 0;
        for(int num : nums){
            //当dp<0时，最大数必定从num[i]开始计数
            dp = Math.max(dp + num, num);
            max = Math.max(dp, max);
        }
        return max;
    }
}
