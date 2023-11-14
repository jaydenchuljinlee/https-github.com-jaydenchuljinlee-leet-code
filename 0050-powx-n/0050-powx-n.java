class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        long N = (long) n;
        if (n < 0) {
            N = -N;
            x = 1/x;
        }
        
        double pow = 1.0;
        
        while(N != 0) {
            // System.out.println(N);
            if ((N%2) != 0) pow*=x;
            // System.out.println(x);
            x *= x;
            N/=2;
        }
        
        return pow;
    }
}