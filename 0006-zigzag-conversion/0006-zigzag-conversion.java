class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] arr = new StringBuilder[numRows];
        
        for (int i = 0; i < arr.length; i++) arr[i] = new StringBuilder();
        
        int idx = 0;
        int flag = 1;
        
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            
            arr[idx] = arr[idx].append(c);
            
            if (idx == 0) flag = 1;
            if (idx == numRows - 1) flag = -1;
            
            idx = idx + flag;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}