class Solution {
    public int prefixCount(String[] words, String pref) {
        int k = 0;
        int n = words.length;
        for(int i = 0; i < n; i++) {
            if (pref.length() > words[i].length()) {
                continue;
            } 

            if(words[i].startsWith(pref)){
                k++;
            }
        }

        return k;
    }
}