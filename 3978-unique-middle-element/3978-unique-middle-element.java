class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            //map.getOrDefault(num,0) returns original value if visited earlier else 0 
           map.put(num , map.getOrDefault(num,0) + 1);
        }
        if(map.get(nums[mid]) == 1){
            return true;
        }
        return false;
    }
}