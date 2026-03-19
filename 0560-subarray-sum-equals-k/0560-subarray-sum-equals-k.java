class Solution {
    public int subarraySum(int[] nums, int k) {
        
        // core idea is store previous sum in hashmap and count its frequency 
        // k = currentSum - previous 
        // CurrentSum == k , previousSum = 0 , map.put(0,1)
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); // currentSum == k 

        int count = 0 ;
        int currentSum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            currentSum += nums[i];
            int previousSum = currentSum - k;
            if(map.containsKey(previousSum)){
                count += map.get(previousSum);
            }

            map.put(currentSum , map.getOrDefault(currentSum , 0) + 1);

        }

        return count;
        
    }
}