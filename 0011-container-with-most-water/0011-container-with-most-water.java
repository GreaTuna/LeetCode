class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int area = 0;

        while (l != r) {
            int min = Math.min(height[l], height[r]);
            int a = min * (r - l);
            if (a > area) {
                area = a;
            }

            if (height[l] > height[r]) {
                r--;
            }
            else {
                l++;
            }
        }
        return area;
    }
}