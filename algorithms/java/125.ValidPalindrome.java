class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;

        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;

        while(i < j){
            int ic = s.charAt(i);
            int jc = s.charAt(j);

            if(!((ic >= 'a' && ic <= 'z') || (ic >= '0' && ic <= '9'))){
                i++;
                continue;
            }

            if(!((jc >= 'a' && jc <= 'z') || (jc >= '0' && jc <= '9'))){
                j--;
                continue;
            }

            if(ic != jc) return false;
            i++;
            j--;
        }
        return true;
    }
}