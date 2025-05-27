class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        //find the pivot ,rightmost element which is greater then its previous elemnt 
        for(int i = n-2 ; i>=0 ; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        //if our pivot does not exit means seq example :[4,3,2,1] => [1,2,3,4] 
        if(pivot == -1){
            reverse(nums ,0 , n-1);
            return ;
        }

        //Find rightmost element greater than pivot 
        for(int i = n-1 ; i> pivot ; i-- ){
            if(nums[i] > nums[pivot]){
                swap(nums,i, pivot);
                break;
            }
        }
        // After swapping of elements we got a permutation close to current permutation 

        //now reverse the rightmost elements after pivot to get next permutation 
        reverse(nums , pivot+1 , n-1);

    }
    //Function to swap elements of array
    public void swap(int[] nums , int start , int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    //Function to reverse the array 
    public void reverse(int[] nums , int start , int end){
        while(start < end){
            swap(nums , start , end);
            start++;
            end--;
        }
    }
}