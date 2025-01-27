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
            max = (k > max) ? k : max;
        }
        return max;
    }
}