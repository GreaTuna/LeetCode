class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i ++) {
            for (int j = i + 1; j < nums.length; j++) {
                frequency.put(
                    nums[i] * nums[j],
                    frequency.getOrDefault(nums[i] * nums[j], 0) + 1
                );
            }
        }

        int answer = 0;
        for (var count : frequency.values()) {
            if (count >= 2) {
                answer += count * (count - 1) / 2;
            }
        }
        return answer * 8;
    }
}