class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int majority = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            if (majority != nums[i]) {
                if (--count == 0) {
                    count = 1;
                    majority = nums[i];
                }
            } else {
                ++count;
            }
        }
        return majority;
    }
}