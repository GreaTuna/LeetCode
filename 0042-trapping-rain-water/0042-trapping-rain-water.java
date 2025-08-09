class Solution {
    public int trap(int[] height) {
        int sum = 0;

        int l = 0;
        int r = height.length - 1;

        int maxL = height[l];
        int maxR = height[r];

        while (l < r) {
            if (maxL < maxR) {
                ++l;
                maxL = Math.max(maxL, height[l]);
                sum += maxL - height[l];
            }
            else {
                --r;
                maxR = Math.max(maxR, height[r]);
                sum += maxR - height[r];
            }
        }
        return sum;
    }
}