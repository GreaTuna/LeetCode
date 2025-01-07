class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        
        int n = words.length;
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(words[i].contains(words[j])) {
                    set.add(words[j]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}