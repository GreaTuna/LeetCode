class Solution {
    public int[] minOperations(String boxes) {
        char[] arr = boxes.toCharArray();
        int n = arr.length;
        int[] result = new int[n];
        
        int count = 0, operations = 0;
        for (int i = 0; i < n; i++) {
            result[i] = operations;
            if (arr[i] == '1') {
                count++;
            }
            operations += count;
        }
        
        count = 0;
        operations = 0;
        for (int i = n - 1; i >= 0; i--) {
            result[i] += operations; 
            if (arr[i] == '1') {
                count++; 
            }
            operations += count;
        }
        
        return result;
    }
}