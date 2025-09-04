class Solution {
    public int findClosest(int x, int y, int z) {

        int P1 = Math.abs(z - x);
        int P2 = Math.abs(z - y);

        if (P1 == P2) {
            return 0; // both equally close
        } else if (P1 < P2) {
            return 1; // x is closer
        } else {
            return 2; // y is closer
        }
    }
}