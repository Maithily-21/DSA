class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int n = s.length();
        
        while(r < n){
            char c = s.charAt(r); 
        
            if(hash[c] != 0){
                // means char is in hash 
                if((hash[c] - 1) >= l){ // Subtract 1 because we store r + 1
                    // we will always check char appearing after left 
                    l = hash[c]; //Move left past the duplicate character
                }
            }
            int len = r-l+1;
            maxLen = Math.max(len , maxLen);
            hash[c] = r + 1; // Store r + 1 so index 0 doesn't look like an empty slot (0)
            r++;
        }
        return maxLen;
    }
}
