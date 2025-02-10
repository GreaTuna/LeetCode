class Solution {
    public String clearDigits(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            var character = s.charAt(i);
            if (Character.isDigit(character) && result.length() > 0) {
                result.setLength(result.length() - 1);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }
}