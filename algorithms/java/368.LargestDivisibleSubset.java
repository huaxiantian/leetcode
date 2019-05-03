class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        //给数组排序并全部赋予初始值1
        Arrays.sort(nums);
        Arrays.fill(dp, 1);
        
        //数组为空，输出空列表
        List<Integer> list = new ArrayList<>();
        if(nums.length == 0) return list;
        
        //建立dp方程
        int[] dp = new int[nums.length];
        int[] num = new int[nums.length];
        int max = 1, max_last = 0;
        
        for(int i =1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] + 1 > dp[i] && nums[i] % nums[j] == 0 ){
                    dp[i] = dp[j] + 1;
                    num[i] = j;
                }
                if (dp[i] > max) {
                    max = dp[i];
                    max_last = i;
                }
            }
        }
        
        for(int i = 0; i < max; i++){
            list.add(nums[max_last]);
            max_last = num[max_last];
        }
        return list;
    }
}
