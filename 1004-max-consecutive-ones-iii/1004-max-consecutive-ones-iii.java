class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0 ;
        int r = 0 ;
        int zeroCount = 0 ;
        int maxLen = Integer.MIN_VALUE;
        while(r < n){
            if(nums[r] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[l] == 0){
                    zeroCount--;
                }
                l++;
            }

            if(zeroCount <= k){
                int currentLen = r - l + 1;
                maxLen = Math.max(currentLen , maxLen);
            }
            r++;
        }

        return maxLen;
    }
}