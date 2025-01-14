class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] arr = new int[n + 1];
        int[] result = new int[n];
    
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[A[i]]++;
            if (arr[A[i]] == 2) count++;
            arr[B[i]]++;
            if (arr[B[i]] == 2) count++;
            result[i] = count;
        }
        result[n - 1] = n;
        return result;
    }
}