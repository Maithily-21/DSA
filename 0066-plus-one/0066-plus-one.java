class Solution {
    public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;   // no carry, just return
            return digits;
        }
        digits[i] = 0; // set current digit to 0 and carry 1 to the left
    }
    // if we reach here, all digits were 9 (e.g., 999 -> 1000)
    int[] result = new int[digits.length + 1];
    result[0] = 1;
    return result;
    }
}