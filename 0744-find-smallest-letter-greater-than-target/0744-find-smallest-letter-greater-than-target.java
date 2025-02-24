class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        var result = '\uFFFF';

        for (var c : letters) {
            if (c < result && c > target) {
                result = c;
            }
        }
        return result != '\uFFFF' ? result : letters[0];
    }
}