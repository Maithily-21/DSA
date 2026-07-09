class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int totalSum = 0 ; 
        for(int num : nums){
            totalSum += num;
        }
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1 ; i < n ; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
       
        int[] leftSum = new int[n];
        leftSum[0] = 0 ;
        for(int i = 1 ; i < n ;i++){
            leftSum[i] = prefix[i-1];
        }
        int[] rightSum = new int[n];
        rightSum[n-1] = 0; 
        for(int i = 0 ; i < n - 1 ;i++){
            rightSum[i] = totalSum - prefix[i];
        }
        int[] answer = new int[n];
        for(int i = 0 ; i < n ; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
}