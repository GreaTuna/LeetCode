class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        char[] arr =  s.toCharArray();
        int n = arr.length;
        int[] diff = new int[n + 1];
        
        for(int[] shift: shifts) { 
            int direction = shift[2] == 1 ? 1 : -1;
            diff[shift[0]] += direction;
            diff[shift[1] + 1] -= direction;
        }
        
        for (int i = 0; i < n; i++) {
            diff[i+1] += diff[i];
        }

        for(int i = 0; i < n; i++) {
            int shift = ((diff[i] % 26) + 26) % 26;
            arr[i] = (char) (97 + (arr[i] - 97 + shift) % 26);
        }
        return new String(arr);
    }
}