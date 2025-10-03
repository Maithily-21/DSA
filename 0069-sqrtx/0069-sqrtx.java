class Solution {
    public int mySqrt(int x) {
        
       if (x < 2) return x;          // handle 0 and 1 early

        int start = 1;
        int end = x / 2;              // sqrt(x) <= x/2 for x >= 2

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sq = (long) mid * mid;   // cast to long to avoid overflow

            if (sq == x) {
                return mid;
            } else if (sq > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end; // end is the floor(sqrt(x))
    }
}