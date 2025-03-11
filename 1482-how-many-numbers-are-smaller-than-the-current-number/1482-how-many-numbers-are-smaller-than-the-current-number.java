class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] += 1;
        }

        for (int j = 1; j <= 100; j++) {
            arr[j] += arr[j - 1];
        }

        for (int k = 0; k < nums.length; k++) {
            int num = nums[k];
            nums[k] = num == 0 ? 0 : arr[num - 1];
        }
        return nums;
    }
}