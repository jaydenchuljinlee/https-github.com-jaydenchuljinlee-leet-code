class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2) return false;
        if (s.length() % 2 != 0) return false;

        Stack<Character> st = new Stack<Character>();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (st.empty()) {
                st.push(s.charAt(i));
                continue;
            }
            char c1 = st.pop();
            char c2 = s.charAt(i);
            
            if ((c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']')) continue;
            
            st.push(c1);
            st.push(c2);
        }

        if (st.empty()) return true;
        return false;
    }
}