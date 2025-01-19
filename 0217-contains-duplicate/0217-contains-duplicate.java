class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (var num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}