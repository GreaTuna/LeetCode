class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increase = 1;
        int decrease = 1;
        int max = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                increase++;
                decrease = 1;
            } 
            else if (nums[i + 1] < nums[i]) {
                decrease++;
                increase = 1;
            } else {
                decrease = 1;
                increase = 1;
            }
            max = Math.max(max, Math.max(increase, decrease));
        }   
        return max;
    }
}