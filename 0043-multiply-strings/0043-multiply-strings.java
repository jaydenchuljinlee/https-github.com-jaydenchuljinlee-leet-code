class Solution {
    public String multiply(String num1, String num2) {
        
        int m = num1.length();
        int n = num2.length();
        
        int[] pos = new int[m+n];
        
        for (int i = m-1; i>=0; i--) {
            for (int j = n-1; j>=0; j--) {
                int n1 = num1.charAt(i) - '0';
                int m1 = num2.charAt(j) - '0';
                
                int sum = (n1*m1) + pos[i+j+1];
                
                int mok = sum/10;
                int rem = sum%10;
                
                pos[i+j+1] = rem;
                pos[i+j] += mok;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < pos.length; i++) {
            // System.out.printf("%s, %s", pos[i], i);
            // System.out.println();
            if (sb.length() == 0 && pos[i] == 0) continue;
            
            sb.append(Integer.toString(pos[i]));
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}