class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < s.length; i++){
            while(num >= values[i]){
                num = num - values[i];
                sb.append(s[i]);
            }
        }
        return sb.toString();
    }
}
