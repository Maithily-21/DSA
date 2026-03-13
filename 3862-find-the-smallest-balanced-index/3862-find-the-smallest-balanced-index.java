class Solution {
    public int smallestBalancedIndex(int[] nums) {

        int n = nums.length;
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        long suffixProduct = 1;
        int ans = -1;

        for (int i = n - 1; i >= 0; i--) {

            long leftSum = prefix[i];

            if (leftSum == suffixProduct) {
                ans = i;
            }

            if (suffixProduct > leftSum) {
                break;
            }

            // prevent overflow
            if (nums[i] != 0 && suffixProduct > Long.MAX_VALUE / nums[i]) {
                break;
            }

            suffixProduct *= nums[i];
        }

        return ans;
    }
}