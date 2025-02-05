class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] arr_1 = new int[26];
        int[] arr_2 = new int[26];
        int diff = 0;

        for (int i = 0; i < s1.length(); i++) {
            var cahar_1 = s1.charAt(i);
            var cahar_2 = s2.charAt(i);

            if(cahar_1 != cahar_2) {
                diff++;
                if (diff > 2) return false;
            }

            arr_1[(int) cahar_1 - 97]++;
            arr_2[(int) cahar_2 - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr_1[i] != arr_2[i]) {
                return false;
            }
        }
        
        return true;
    }
}