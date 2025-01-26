class Solution {
    public int lengthOfLastWord(String s) {
        char[] arr = s.toCharArray();
        int i = arr.length - 1;
        int k = 0;
        while (i >= 0) {
            if (arr[i] != ' ') {
                k++;
            } else if (k > 0) {
                return k;
            }
            i--;
        }
        return k;
    }
}