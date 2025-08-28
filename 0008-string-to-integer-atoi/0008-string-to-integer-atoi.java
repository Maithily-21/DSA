class Solution {
    public int myAtoi(String s) {
        
        int flag = 1 ; //for + (1) / - (0)
        int idx = 0 , result = 0;

        // 1] ignore leading whitespaces 
        while(idx < s.length() && s.charAt(idx) == ' '){
            idx++;
        }
        // 2] Determine sign 
        if(idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+') ){
            if(s.charAt(idx++) == '-'){
                flag = -1 ;
            }
        }

        // form the number through digits 

        while(idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9'){

            // Overflow and underflow cases 
            if (result > Integer.MAX_VALUE / 10 ||  (result == Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > 7)) {
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result*10 + (s.charAt(idx++) - '0') ;
        }

        return result*flag ;
    }
}