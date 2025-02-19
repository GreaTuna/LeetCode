class Solution {
    public boolean isValid(String s) {
        int length = s.length();
        if (length % 2 != 0) {  
            return false;
        }

        int index = -1;
        char[] arr = new char[length];
        for (var character : s.toCharArray()) {
            if (character == '(') {
                arr[++index] = ')';
            }
            else if (character == '[') {
                arr[++index] = ']';
            }
            else if (character == '{') {
                arr[++index] = '}';
            }
            else if (index == -1 || arr[index--] != character) {
                return false;
            }
        }
        return index == -1;
    }
}