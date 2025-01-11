class Solution {
    public boolean canConstruct(String s, int k) {
        if (k > s.length()) return false;
        if (k == s.length()) return true;

        int[] arr = new int[26];

        for (char character : s.toCharArray()) {
            arr[character - 'a'] += 1;
        }

        int count = 0;
        for(int i : arr) {
            if (i % 2 != 0) {
               count++; 
            }
        }
        return count <= k;
    }
}
