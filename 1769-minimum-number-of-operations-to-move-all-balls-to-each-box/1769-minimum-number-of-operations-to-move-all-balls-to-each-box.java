class Solution {
    public int[] minOperations(String boxes) {
        char[] arr = boxes.toCharArray();
        int n = arr.length;
        int[] l = new int[n];
        int[] r = new int[n];
        int[] result = new int[n];
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                l[i] = l[i - 1] + count; 
            }
            if (arr[i] == '1') {
                count++;
            }
        }
        
        count = 0; 
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1) {
                r[i] = r[i + 1] + count; 
            }
            if (arr[i] == '1') {
                count++; 
            }
        }
        
        for (int i = 0; i < n; i++) {
            result[i] = l[i] + r[i];
        }
        
        return result;
    }
}