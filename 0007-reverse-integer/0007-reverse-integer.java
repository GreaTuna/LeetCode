class Solution {
    public int reverse(int x) {
        int y = 0;
        for (int i = Math.abs(x); i > 0; i /= 10) {
            if (y > Integer.MAX_VALUE / 10) {
                return 0; 
            }
            y = (y * 10) + (i % 10);
        }

        return x >= 0 ? y : -y;
    }
}