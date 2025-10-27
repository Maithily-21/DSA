class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        // Brute Force - O(N)
        int MaxCount = 0 ;
        int CurrentCount = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                CurrentCount++;
                MaxCount = Math.max(MaxCount , CurrentCount);
            }else{
                CurrentCount = 0;
            }
        }

        return MaxCount;
    }
}