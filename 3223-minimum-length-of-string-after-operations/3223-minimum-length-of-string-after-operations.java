class Solution {
    public int minimumLength(String s) {
       int[] arr = new int[26];

       for (var character : s.toCharArray()) {
           int element = character - 97;    
           arr[element] += 1;
       }

        int count = 0;
        for (int element : arr) {
            if (element > 0) {
                if (element % 2 == 0) {
                    count += 2;
                } else {
                    count++;
                }
            }
       }
       
       return count;
    }
}