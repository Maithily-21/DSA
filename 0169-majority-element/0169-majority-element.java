class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = n/2 ;
      
        //Brute Force 
        for(int i = 0 ;  i < n ;i++){
            int key = nums[i];
            int count = 0 ;
            for(int j = 0 ; j < n ; j++){
                if(key == nums[j]){
                    count++;
                }
            }
            if(count > majority){
                return key;
            }
        }

      return -1; 
    }
}