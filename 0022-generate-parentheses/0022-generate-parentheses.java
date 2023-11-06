class Solution {
    int nn;
    List<String> s;
    public List<String> generateParenthesis(int n) {
        nn = n;
        s = new ArrayList<>();
        
        parenthesis(0, 1, new StringBuilder("("));
        
        return s;
    }
    
    void parenthesis(int close, int open, StringBuilder sb) {
        if (close >= nn) {
            // System.out.println(sb.toString());
            if (sb.length() != nn*2) return;
            
            // System.out.println(sb.toString());
            s.add(sb.toString());
            return;
        };
        
        if (open < nn) {
            sb.append("(");
            
            parenthesis(close, open+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
        
        if (close < open && close < nn) {
            sb.append(")");
            parenthesis(close+1, open, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}