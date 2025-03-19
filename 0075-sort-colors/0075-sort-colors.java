class Solution {
    public void sortColors(int[] nums) {
        int white = 0;
        int red = nums.length - 1;
        int i = 0;

        while (i <= red) {
            if (nums[i] == 0) {
                int temp = nums[white];
                nums[white] = nums[i];
                nums[i] = temp;
                white++;
                i++;
            } 
            else if (nums[i] == 2) {
                int temp = nums[red];
                nums[red] = nums[i];
                nums[i] = temp;
                red--;
            }
            else i++;
        }
    }
}