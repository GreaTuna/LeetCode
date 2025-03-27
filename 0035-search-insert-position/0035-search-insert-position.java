class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (nums[m] == target) {
                return m;
            }
            else if (target > nums[m]) {
                l = ++m;
            }
            else {
                r = --m;
            }
        }
        return l;
    }
}