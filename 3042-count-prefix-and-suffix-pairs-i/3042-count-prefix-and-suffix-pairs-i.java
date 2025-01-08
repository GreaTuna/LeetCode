class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int k = 0;
        int n = words.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i+1; j < n; j++) {
                if (words[i].length() > words[j].length()) {
                    continue;
                } 
               
                if(words[j].startsWith(words[i]) && words[j].endsWith(words[i])){
                    k++;
                }
                
            } 
        }

        return k;
    }
}