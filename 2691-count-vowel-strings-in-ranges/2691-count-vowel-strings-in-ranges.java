class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
      
        int[] sequence = new int[words.length + 1];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean letter_1 = vowels.contains(word.charAt(0));
            boolean letter_2 = vowels.contains(word.charAt(word.length() - 1));
            sequence[i+1] = sequence[i] + (letter_1 && letter_2 ? 1 : 0);
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = sequence[queries[i][1] + 1] - sequence[queries[i][0]];
        }
        return result;
    }
}