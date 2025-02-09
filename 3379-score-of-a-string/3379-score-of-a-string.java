class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            score += Math.abs((int) (arr[i] - arr[i+1]));
        }
        return score;
    }
}