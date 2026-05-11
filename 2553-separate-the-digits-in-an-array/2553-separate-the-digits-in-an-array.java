class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // Iterate through each number in the input array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            ArrayList<Integer> temp = new ArrayList<>();
            
            // Extract digits (these come out in reverse order)
            while (num > 0) {
                temp.add(num % 10);
                num /= 10;
            }
            
            // Reverse the digits of THIS specific number to get correct order
            Collections.reverse(temp);
            
            // Add these digits to our final list
            answer.addAll(temp);
        }
        
        // Convert ArrayList<Integer> to primitive int[]
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
