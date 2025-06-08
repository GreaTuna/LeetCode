class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        if (arr1.length == 0) {
            return true;
        }
        if (arr2.length < arr1.length) {
            return false;
        }

        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[count] == arr2[i]) {
                count++;
                if (count == arr1.length) return true;
            }
        }
        return false;
    }
}