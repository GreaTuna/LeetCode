class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int s1 = a.length() - 1;
        int s2 = b.length() - 1;

        while (s1 >= 0 || s2 >= 0 || carry != 0) {
            if (s1 >= 0) {
                carry += a.charAt(s1--) - '0';
            }
            if (s2 >= 0) {
                carry += b.charAt(s2--) - '0';
            }
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}