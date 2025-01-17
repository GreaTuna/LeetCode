class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int sum = 0;
        for (int element : derived) {
            sum ^= element;
        }
        return sum == 0;
    }
}