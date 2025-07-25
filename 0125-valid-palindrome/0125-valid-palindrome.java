class Solution {
    public boolean isPalindrome(String s) {
        if(s == null){
            return false;
        }

        int i = 0 ; //0th index
        int j = s.length() - 1 ; // last index

        while( i < j){
            char left = s.charAt(i);
            char right  = s.charAt(j);

            // Check if any other symbol is there other than a digit or letter , if found skip that and update counter 
            if (!Character.isLetterOrDigit(left)) {
                 i++; 
                 continue;
                }
            if (!Character.isLetterOrDigit(right)) {
                 j--; 
                 continue; 
                 }

            // Compare charaters from both sides if not equal return false 
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
                }

            // Update counters for next iteration 
            i++;
            j--;

        }
        return true;
    }
}