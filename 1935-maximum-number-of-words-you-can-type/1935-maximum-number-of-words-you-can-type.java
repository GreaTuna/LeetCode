class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        char[] text_chars = brokenLetters.toCharArray();
        int count = words.length; 

        for (var word : words) {
            for (var character : text_chars) {
                if (word.contains(String.valueOf(character))) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}