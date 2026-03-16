class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int[] mx = new int[n];

        mx[0] = nums[0];

        // we are caluclating maximum from 0  to i th index =====> prefix maximum array 
        for(int i = 1 ; i < n ; i++){
            mx[i] = Math.max(mx[i-1] , nums[i]);
        }

        for(int i = 0 ; i < n ; i++){
            prefixGcd[i] = gcd(nums[i] , mx[i]);
        }

        Arrays.sort(prefixGcd);

        // for pairs use two pointers 
        int left = 0 ;
        int right = n - 1;
        long gcdSum = 0 ;
        while(left < right){
            gcdSum += gcd(prefixGcd[left] , prefixGcd[right]);
            left++;
            right--;
        }

        return gcdSum;
    }

    static int gcd(int a  , int b ){
        if(b == 0){
            return a ;
        }

        return gcd(b , a%b);
        
    }
}