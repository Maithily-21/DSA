class Solution {
    public String addBinary(String a, String b) {
       StringBuilder sb = new StringBuilder();
        
        int i = a.length() - 1 ; 
        int j = b.length() - 1; 
        int carry = 0 ;
        
        while( i >= 0 || j >= 0 || carry > 0){
            int x = (i >= 0 ) ? a.charAt(i) - '0' : 0 ;
            int y = (j >= 0 ) ? b.charAt(j) - '0' : 0 ;
            
            int sum = x + y + carry ;
            
            sb.append(sum % 2); 
            carry = sum / 2 ; 
            i--;
            j--;
            
        }
        
        String result = sb.reverse().toString();
        
        int idx = 0 ;
        
        while(idx < result.length() - 1 && result.charAt(idx) == '0'){
            idx++;
        }
        
        return result.substring(idx);
        
    }
}