class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int e = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (e != nums[i]) {
                k++;
                nums[k] = nums[i];
                e = nums[i];
            }
        }
        return k+1;
    }
}