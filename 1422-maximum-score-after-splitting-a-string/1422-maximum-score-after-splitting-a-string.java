class Solution {
    public int maxScore(String s) {
        char[] arr = s.toCharArray();
        
        var ones = 0;
        for(var e : arr) {
            if (e == '1') {
                ones++;
            }
        }

        int max = 0;
        int zeros = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '0') {
                zeros++;
            } else {
                ones--;
            }
            max = Math.max(max, zeros + ones);
        }

        return max;
    }
}