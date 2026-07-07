class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0 ;
        long x = 0 ;
        long i = 1 ;
        while(n > 0){
            int digit = n % 10;
            if(digit != 0){
                x += digit*i;
                sum += digit;
                i = i*10 ;
            }
            n = n / 10;
        }

        return x*sum;
    }
}