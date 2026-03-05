class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 1){
            return (double) nums[0];
        }

        double mx = Integer.MIN_VALUE;
        int i = 0 ; 
        int j = 0 ; 
    
        double avg = 0 ; 
        int sum = 0 ;
        while(j < nums.length){
            sum = sum + nums[j];
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                avg = (double) sum / k;
                mx = Math.max(mx , avg);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }

        return mx;
    }
}