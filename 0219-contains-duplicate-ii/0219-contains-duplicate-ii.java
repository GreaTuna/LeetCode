class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            Integer value = map.get(key);

            if (value != null && Math.abs(value - i) <= k) {
                return true;
            }
            map.put(key, i);
        }
        return false;
    }
}