class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (var num : nums) { 
            if (set.remove(num)) {
                continue;
            }
            set.add(num);
        }
        return set.iterator().next();
    }
}