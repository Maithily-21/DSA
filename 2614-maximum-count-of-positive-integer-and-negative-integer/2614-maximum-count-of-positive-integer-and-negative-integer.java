public class Solution {
    public static int maximumCount(int[] nums) {
        // Target : To find max(no.of +ve num ,no.of -ve num )
        //initial count 
        int positive  = 0 ;
        int negative = 0 ; 
        
        // Check traverse in array 
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                positive++ ;
            }else if(nums[i] < 0){
                negative++ ;
            }
        }
       
        return Math.max(positive , negative) ;
    }

}
