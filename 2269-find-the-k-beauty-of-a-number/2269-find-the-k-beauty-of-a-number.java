class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = Integer.toString(num);
        int l = 0 , r= 0;
        int count = 0 ;
        while(r < s.length()){
            String sub = s.substring(l , r+1);
            if(r-l+1 == k){
                int x = Integer.parseInt(sub);
                if(x != 0 && num % x == 0){
                    count++;
                }
                l++;
            }
            r++;
        }

        return count;
    }
}