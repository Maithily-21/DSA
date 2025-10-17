class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] ans = new int[2*n];
        
        ans[0] = nums[0];
        int j = 0;
        for(int i = 1 ; i < 2 * n ; i++){
            if(i%2 != 0){

                ans[i] = nums[n + j];
                j++;
            }
            else{
                ans[i] = nums[j];
            }

            
        }

        return ans;
    }
}