class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0 ;
        int r = 0 ; 
        double maxAvg = Integer.MIN_VALUE;
        int sum = 0 ;
        while(r < nums.length){
            sum += nums[r];
            if(r-l+1 == k){
               double avg = (double) sum / k;
               maxAvg = Math.max(maxAvg , avg);
               sum = sum - nums[l];
               l++;
            }
            r++;
        }

        return maxAvg;
    }
}