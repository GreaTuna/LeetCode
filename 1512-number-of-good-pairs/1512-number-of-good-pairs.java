class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int k = 0;
        for (var num : nums) {
            var count = map.get(num);
            if (count == null) {
                map.put(num, 0);
                continue;
            }
            k += ++count;
            map.put(num, count);
        }
        return k;
    }
}