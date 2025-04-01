class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (var num : nums) { 
            if (map.get(num) != null) {
                map.remove(num);
                continue;
            }
            map.put(num, 1);
        }
        return map.keySet().iterator().next();
    }
}