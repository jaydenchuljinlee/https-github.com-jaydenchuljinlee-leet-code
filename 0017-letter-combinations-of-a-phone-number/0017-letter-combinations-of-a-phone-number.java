class Solution {
    List<String> result = new ArrayList<>();
    String[] sList = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if (digits.length() < 1) return result;
        
        combine(0, new StringBuilder(""), digits);
        
        return result;
    }
    
    void combine(int len, StringBuilder sb, String digits) {
        if (len == digits.length()) {
            result.add(sb.toString());
            return;
        }
        
        int idx = digits.charAt(len) - '0';
        
        for (int i = 0; i < sList[idx].length(); i++) {
            sb.append(sList[idx].charAt(i));
            combine(len+1, sb, digits);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}