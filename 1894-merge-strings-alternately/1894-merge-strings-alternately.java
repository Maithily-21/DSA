class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        int m = word1.length();
        int n = word2.length();

        int i = 0 , j = 0 ; // set two pointers 

        while(i < m && j < n) {

            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));

            i++; //update pointers
            j++;  
        }

        // Append the string which is longer 

        while(i < m){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j < n){
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}