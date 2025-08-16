class Solution {
    public int maximum69Number (int num) {
        int temp = num ;

        int digits = 0;
        while(temp > 0){
            digits++;
            temp /= 10 ;
        }
        int result = 0 ;
        boolean changed = false;

        for(int i = digits - 1 ; i >= 0; i--){
            int divisor = (int) Math.pow(10 , i);
            int currentDigit = num / divisor ;
            num %= divisor ;

            if(!changed && currentDigit == 6){
                currentDigit = 9;
                changed = true;
            }
            result = result * 10 + currentDigit;
        }

        return result ;
    }
}