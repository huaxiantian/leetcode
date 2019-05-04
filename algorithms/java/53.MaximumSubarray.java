class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, dp = 0;
        for(int num : nums){
            dp = Math.max(dp + num, num);
            max = Math.max(dp, max);
        }
        return max;
    }
}
