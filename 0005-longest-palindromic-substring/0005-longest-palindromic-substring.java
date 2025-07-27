class Solution {
    public String longestPalindrome(String s) {
        int sLength = s.length();

        if (sLength == 0) {
            return "";
        }

        int start = 0;
        int end = 0;

        for(int i = 0 ; i < sLength; i++) {
            int len = Math.max(expand(s, i, i), expand(s, i, i + 1));

            if (end - start + 1 < len) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}