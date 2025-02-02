class Solution {
    public boolean check(int[] nums) {
        if (nums.length < 2) {
            return true;
        }
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            k = nums[i] > nums[i + 1] ? ++k : k;
        }
        k = nums[0] < nums[nums.length - 1] ? ++k : k;
        return k <= 1;
    }
}