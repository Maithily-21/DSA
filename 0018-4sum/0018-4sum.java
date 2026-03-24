class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;
        
        List<List<Integer>> result = new ArrayList<>();

        //sort array
        Arrays.sort(nums);

        // Two pointers - sorted arrays

        for(int i = 0 ;i < n-3; i++){
            //skip du[plicate for i 
            if(i > 0 && nums[i] == nums[i-1]){
                continue ; 
            }

            for( int j = i + 1 ; j < n-2 ; j++){
                 //skip du[plicate for j 
                if(j > i+ 1 && nums[j]==nums[j-1]){
                    continue;
                }

                // again set two pointer for a particular pair 
                int left = j + 1 ;
                int right = n - 1 ;

                while(left < right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == target){
                        result.add(Arrays.asList(nums[i] , nums[j] , nums[left] , nums[right]));
                        //skip duplicate for left pointer 
                        while(left < right && nums[left] == nums[left + 1]){
                            left++;
                        }

                        //skip duplicate for right pointer 
                        while(left < right && nums[right] == nums[right - 1]){
                            right--;
                        }

                        left++;
                        right--;
                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }

        return result;

    }
}