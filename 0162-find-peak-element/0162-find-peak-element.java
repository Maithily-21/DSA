class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0 ;
        int end = nums.length - 1 ;

        while(start < end ){
            int mid = start + (end - start)/2 ;

            if(nums[mid] > nums[mid + 1]){
                //You are in decresing order of array , this may be possible answer but look at left
                // this is why end != mid - 1 
                end = mid ; // to check on left side
               
            }else{
                // You are in increasing order of array , check right part
                // becoz arr[mid+1] > arr[mid] , so ignore mid element
                start = mid + 1 ;
            }
        }
        //In end start == end , both will point to the largest value ....becoz of above two conditions 
        return start;
    }
}