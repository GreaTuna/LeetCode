class Solution {
    public boolean canBeValid(String s, String locked) {
        var n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        char[] arr_s = s.toCharArray();
        char[] arr_locked = locked.toCharArray();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr_s[i] == '(' || arr_locked[i] == '0') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }

        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr_s[i] == ')' || arr_locked[i] == '0') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }

        return true;
    }
}