class Solution {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        if (n == 0) return 1;

        long power = n;  // cast to long
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        return Pow(x, power);
    }

    private double Pow(double x, long n) {
        if (n == 0) return 1;

        double half = Pow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}