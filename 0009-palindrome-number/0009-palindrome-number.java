class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int num = 0;
        for (int y = x; y > 0; y /= 10) {
            num = (num * 10) + (y % 10);
        }
        return num == x;
    }
}