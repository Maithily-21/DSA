class Solution {
    public boolean isAnagram(String s, String t) {
        
        // convert both strings to lowercase to avoid uperrcase part 
        s = s.toLowerCase();
        t = t.toLowerCase();

        // check if both strings are of equal length 
        if(s.length() == t.length()){

            // make char arrays of both the strings 
            char[] sCharArray = s.toCharArray();
            char[] tCharArray = t.toCharArray();

            // sort both the char arrays 
            Arrays.sort(sCharArray);
            Arrays.sort(tCharArray);

            if(Arrays.equals(sCharArray , tCharArray)){
                return true;
            }

        }


        return false ;

    }
}