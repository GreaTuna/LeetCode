class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] arr_2 = new int[26];

        for(var word : words2) {
            int[] count = new int[26];
            for(char character : word.toCharArray()) {
                count[character - 'a'] += 1;
            }
            for (int k = 0; k < 26; k++) {
                arr_2[k] = Math.max(count[k], arr_2[k]);
            }
        }

        boolean flag = true;
        List<String> answer = new ArrayList<>();
        for(var word : words1) {
            int[] arr_1 = new int[26];
            for (char character : word.toCharArray()) {
                arr_1[character - 'a'] += 1;
            }

            flag = true;
            for (int k = 0; k < 26; k++) {
                if (arr_2[k] > arr_1[k]) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer.add(word);
        }

        return answer;
    }
}