class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num) + 1);
            }else{
                map.put(num , 1);
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0 && map.get(nums[i]) == 1){
                return nums[i];
            }
        }

        return -1;
    }
}