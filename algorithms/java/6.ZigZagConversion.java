class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows == 1) return s;
        
        int n = 2 * numRows - 2;
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < numRows; i++){
            for(int j = i; j < s.length(); j += n){
                
                sb.append(s.charAt(j));
                if(i != 0 && i != numRows - 1){
                    
                    int temp = j + n - 2 * i;
                    if(temp < s.length()){
                        sb.append(s.charAt(temp));
                    }
                }
            }
        }
        return sb.toString();
    }
}
