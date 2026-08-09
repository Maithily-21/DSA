class Solution {
    public long maxPairStrength(int[] nums) {
        long maxStrength = Long.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                long g = gcd(nums[i],nums[j]);
                long pairGcd = ((long) nums[i]*nums[j]) / (g*g);
                maxStrength = Math.max(maxStrength , pairGcd);
            }
        }

        return maxStrength;
    }
    public int gcd(int a , int b){
        while(b != 0){
            int r = a % b ;
            a = b;
            b = r;
        }
        return a; //when b == 0 
    }
}