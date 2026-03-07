class Solution {
    public int minFlips(String s) {

        int n = s.length();
        String doubled = s + s;

        int flip1 = 0;
        int flip2 = 0;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < doubled.length(); i++){

            char expected1 = (i % 2 == 0) ? '0' : '1';
            char expected2 = (i % 2 == 0) ? '1' : '0';

            if(doubled.charAt(i) != expected1) flip1++;
            if(doubled.charAt(i) != expected2) flip2++;

            if(i >= n){
                int j = i - n;

                char prev1 = (j % 2 == 0) ? '0' : '1';
                char prev2 = (j % 2 == 0) ? '1' : '0';

                if(doubled.charAt(j) != prev1) flip1--;
                if(doubled.charAt(j) != prev2) flip2--;
            }

            if(i >= n-1){
                ans = Math.min(ans, Math.min(flip1, flip2));
            }
        }

        return ans;
    }
}