class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        getList(lists, new ArrayList<Integer>(), nums, flag);
        return lists;
    }
    
    public void getList(List<List<Integer>> lists,
                        List<Integer> list,
                        int[] nums, 
                        boolean[] flag){
        
        if(list.size() == nums.length){
            lists.add(new ArrayList<>(list));
            return ;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(flag[i]) continue;
            flag[i] = true;
            list.add(nums[i]);
            getList(lists, list, nums, flag);
            flag[i] = false;
            list.remove(list.size() - 1);
        }
    }
}
