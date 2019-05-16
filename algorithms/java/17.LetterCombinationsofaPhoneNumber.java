class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();
        
        List<String> list = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        getList("", digits, 0,  list, map);
        return list;
    }
    
    public void getList(String s, String digits, int i, List<String> list, Map<Character, String> map){
        if(i == digits.length()){
            list.add(s);
            return ;
        }
        
        String res = map.get(digits.charAt(i));
        for(int j = 0; j < res.length(); j++){
            getList(s + res.charAt(j), digits, i + 1, list, map);
        }
    }
}
