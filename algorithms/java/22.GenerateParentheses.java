class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        getList(list, "", n, n);
        return list;
    }
    
    public void getList(List<String> list, String s, int left, int right){
        if(left > right) return;
        
        if(left == 0 && right == 0){
            list.add(s);
            return;
        }
        
        if(left > 0) getList(list, s + "(", left - 1, right);
        
        if(right > 0) getList(list, s + ")", left, right - 1);
    }
}
