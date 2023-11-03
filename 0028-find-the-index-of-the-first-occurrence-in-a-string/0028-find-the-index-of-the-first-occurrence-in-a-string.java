class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;

        int len = needle.length();

        for (int i = 0; i + len <= haystack.length(); i++) {
            String s = haystack.substring(i, i + len);
            if (s.equals(needle)) return i;
        }

        return -1;
    }
}