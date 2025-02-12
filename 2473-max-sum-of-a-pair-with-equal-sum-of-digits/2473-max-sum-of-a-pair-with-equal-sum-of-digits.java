class Solution {
    public int maximumSum(int[] nums) {
        int[] arr = new int[82];
        int max = -1;

        for (var num : nums) {
            int sum = 0;
            int num_copy = num;

            while (num_copy != 0) {
                sum += num_copy % 10;
                num_copy /= 10;
            }

            if (arr[sum] != 0) {
                max = Math.max(max, num + arr[sum]);
            }

            arr[sum] = Math.max(arr[sum], num);
        }

        return max;
    }
}