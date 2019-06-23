class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lists = new ArrayList<>();
        helper(candidates, target, 0, 0, lists, new ArrayList<>());
        return lists;
    }

    public void helper(int[] candidates, int target, int sum, int begin, List<List<Integer>> lists, List<Integer> list){

        if(sum == target){
            lists.add(new ArrayList<>(list));
            return;
        }

        for(int i = begin; i < candidates.length; i++){
            if(sum + candidates[i] > target) break;
            if(i > begin && candidates[i] == candidates[i-1]) continue;

            list.add(candidates[i]);
            helper(candidates, target, sum + candidates[i], i + 1, lists, list);
            list.remove(list.size() - 1);
        }
    }
}