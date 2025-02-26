class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int previous = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            int temp = current;
            current += previous;
            previous = temp;
        }
        return current;
    }
}