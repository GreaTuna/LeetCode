class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0; 
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                l = mid;
                r = mid;

                while(l > 0 && nums[l] == nums[l - 1]) {
                    l--;
                }
                while(r < nums.length - 1 && nums[r] == nums[r + 1]) {
                    r++;
                }
                return new int[] {l, r};
            } 
            else if (nums[mid] > target) {
                r = mid - 1;
            } 
            else {
                l = mid + 1;
            }
        }

        return new int[] {-1, -1};
    }
}