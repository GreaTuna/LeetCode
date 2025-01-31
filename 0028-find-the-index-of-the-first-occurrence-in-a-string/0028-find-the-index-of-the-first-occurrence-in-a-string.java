class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        char[] needle_arr = needle.toCharArray();
        char[] haystack_arr = haystack.toCharArray();
        for (int i = 0; i < haystack_arr.length; i++) {
            for (int j = 0; j < needle_arr.length; j++) {
                if (haystack_arr.length - i < needle_arr.length) {
                    break;
                }
                if (needle_arr[j] == haystack_arr[i + j]) {
                    index = j == 0 ? i : index;
                } else {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                return index;
            }
        }
        return index;
    }
}