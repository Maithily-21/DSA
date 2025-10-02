class Solution {
    public int search(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length -1 ;

        while(start <= end){
            int mid = start + (end - start)/2; 

            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid]){  //search on right
                start = mid + 1;
            }else{
                end = mid - 1 ;  // search on left
            }
        }
        return -1;
    }
}