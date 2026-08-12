class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
            HashMap<Integer, Integer> counts = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // Add the current number to our count
            counts.put(nums[right], counts.getOrDefault(nums[right], 0) + 1);
            
            // If the count goes over k, shrink the window from the left
            while (counts.get(nums[right]) > k) {
                counts.put(nums[left], counts.get(nums[left]) - 1);
                left++;
            }
            
            // Calculate the current window size and save the maximum
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}