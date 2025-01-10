class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] arr_2 = new int[26];
        int[] count = new int[26];

        for(var word : words2) {

            for(char character : word.toCharArray()) {
                count[character - 'a'] += 1;
            }
            for (int k = 0; k < 26; k++) {
                arr_2[k] = Math.max(count[k], arr_2[k]);
            }
            Arrays.fill(count, 0);
        }

        int[] arr_1 = new int[26];
        List<String> answer = new ArrayList<>();
        for(var word : words1) {
            for (char character : word.toCharArray()) {
                arr_1[character - 'a'] += 1;
            }

            boolean flag = true;
            for (int k = 0; k < 26; k++) {
                if (arr_2[k] > arr_1[k]) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer.add(word);
            Arrays.fill(arr_1, 0);
        }

        return answer;
    }
}