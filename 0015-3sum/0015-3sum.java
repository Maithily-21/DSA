class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
       //By Two pointers 

       List<List<Integer>> result = new ArrayList<>();
       Arrays.sort(nums);
       int n = nums.length ;

       for(int i = 0 ; i < n-2 ; i++){
            int left = i+1 ;
            int right = n - 1 ; 

             //skip duplicate iteration 
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    //skip duplicates in left & right 
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    
                    // increment pointers
                    left++;
                    right--;
                }
                else if(sum < 0){ // when sum is too small , increment left
                    left++;
                }else{
                    right--;  // when sum  is too large , decrement right
                }  
            }
       }

       return result;
    }
}