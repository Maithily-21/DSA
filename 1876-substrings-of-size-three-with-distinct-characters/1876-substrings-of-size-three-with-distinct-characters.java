class Solution {
    public int countGoodSubstrings(String s) {
        int k = 3 ;
        int l = 0 ;
        int r = 0 ; 
        int count = 0;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        while(r < n){
            char rightChar = s.charAt(r);
            //remove left elements untill the duplicate is fully removed from set 
            while(set.contains(rightChar)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(rightChar);
            //form k window we will be having unique characters 
            if(r-l+1 == k){
                count++;
                set.remove(s.charAt(l));
                l++;
            }
            r++;
        }
        return count;
    }
}