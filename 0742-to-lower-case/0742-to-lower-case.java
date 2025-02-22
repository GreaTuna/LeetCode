class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int c : s.toCharArray()) {
            if (c >= 65 && (int) c <= 90) {
                sb.append((char) (c + 32));
            } else {
                sb.append((char) c);
            }
        }
        return sb.toString();
    }
}