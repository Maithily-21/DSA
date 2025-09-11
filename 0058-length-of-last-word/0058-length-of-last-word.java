class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int i = n - 1;

        // skip spaces  while traversing from back 
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }

        int length = 0 ;

        while(i >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }

        return length;
    }
}