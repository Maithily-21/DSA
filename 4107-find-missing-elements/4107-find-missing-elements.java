class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        ArrayList<Integer> missingNo = new ArrayList<>();

        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length - 1];

        int j = 0 ; 

        for(int i = smallest ; i <= largest ; i++){
           if(nums[j] == i && j < nums.length){
                j++;
           }else{
                missingNo.add(i);
           }
          
        }
        
        return missingNo;

    }
}