class Solution {
    public int reverse(int x) {
        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) return 0;
        
        long result = 0;
        
        while(x != 0) {
            int res = x % 10;
            int mok = x / 10;
            
            if (Math.abs(result*10 + res) > Integer.MAX_VALUE) return 0;
            
            result *= 10;
            result += res;
            
            x = mok;
        }
        
        return Long.valueOf(result).intValue();
    }
}