class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null) return 0;

        s = s.trim();
        int i = s.length() - 1;

        for(; i >= 0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
        }

        return s.substring(i + 1, s.length()).length();
    }
}