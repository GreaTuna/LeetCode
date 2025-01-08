class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int k = 0;
        int n = words.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i+1; j < n; j++) {
                var str_1 = words[i];
                var str_2 = words[j];
                var length_1 = str_1.length();
                var length_2 = str_2.length();

                if (length_1 > length_2) {
                    continue;
                } 
                if (!str_2.substring(0, length_1).equals(str_1)) {
                    continue;
                }
                if(!str_2.substring(length_2 - length_1, length_2).equals(str_1)) {
                    continue;
                }
                k++;
            } 
        }

        return k;
    }
}