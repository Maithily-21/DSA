class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
       Arrays.sort(nums);
       int n = nums.length ;

       int closestSum = nums[0] + nums[1] + nums[2];

       for(int i = 0 ; i < n-2 ; i++){
            int left = i+1 ;
            int right = n - 1 ; 

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];

                if(Math.abs(target - sum) < Math.abs(target - closestSum)){
                    closestSum = sum ;
                }

                if(sum < target){ // when sum is too small , increment left
                    left++;
                }else if (sum > target){
                    right--;  // when sum  is too large , decrement right
                }
                else{
                    return sum ; // exact target found 
                }
            }
       }

       return closestSum;


    }
}