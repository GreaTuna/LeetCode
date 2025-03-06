class Solution {
    public int secondHighest(String s) {
        boolean flag = false;
        for (char i = '9'; i >= '0'; i--) {
            if (s.indexOf(i) != -1) {
                if (flag) {
                    return  i - '0';
                }
                flag = true;
            }
        }
        return -1;
    }
}