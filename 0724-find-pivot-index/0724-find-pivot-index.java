class Solution {
    public int pivotIndex(int[] nums) {
        
        //optimal solution - O(1)
        int totalSum = 0 ;
        for(int num : nums){
            totalSum += num;
        } 
        int leftSum = 0 ;
        //core idea =>rightSum =  totalSum - leftsum - nums[i];
        for(int i = 0 ; i < nums.length ; i++){

            int rightSum =  totalSum - leftSum - nums[i];

            if(rightSum == leftSum){
                return i ;
            }

            leftSum += nums[i];
        }

        return -1;

    }
}