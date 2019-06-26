class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        Arrays.fill(result, -1);
        int i = 0, j = nums.length - 1;

        while(i <= j){
            int mid = i + (j-i)/2;
            if(nums[mid] == target){
                i = mid;
                j = mid;
                while(i > 0 && nums[i] == nums[i-1]) i--;
                result[0] = i;

                while(j < nums.length - 1 && nums[j] == nums[j+1]) j++;
                result[1] = j;
                break;
            } else if(nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return result;
    }
}