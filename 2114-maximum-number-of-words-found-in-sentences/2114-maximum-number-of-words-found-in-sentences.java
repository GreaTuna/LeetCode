class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int k = 1;
            for (var i : sentence.toCharArray()) {
                if (i == ' ') {
                    k++;
                }
            }
            if (k > max) {
                max = k;
            }
        }
        return max;
    }
}