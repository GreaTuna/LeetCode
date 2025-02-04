class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                max = Math.max(max, sum);
                sum = 0;
            }
            sum += nums[i];
        }
        return Math.max(max, sum);
    }
}