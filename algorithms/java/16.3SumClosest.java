class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int min = nums[0] + nums[1] + nums[2], sum = 0;
        for(int i = 0; i < nums.length; i++){
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(target-sum) < Math.abs(target-min)){
                    min = sum;
                }
                if(sum > target){
                    k--;
                } else if (sum < target){
                    j++;
                } else {
                    return min;
                }
            }

        }
        return min;
    }
}