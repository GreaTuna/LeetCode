class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if(words[i].contains(words[j]) && !list.contains(words[j])) {
                    list.add(words[j]);
                }
            }
        }

        return list;
    }
}