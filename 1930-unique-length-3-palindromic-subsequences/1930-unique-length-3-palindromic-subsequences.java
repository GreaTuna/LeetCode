class Solution {
    public int countPalindromicSubsequence(String s) {
        var charArray = s.toCharArray();
        HashMap<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            map.computeIfAbsent(charArray[i], ArrayList::new).add(i);
        }   

        int k = 0;
        for (List<Integer> lst : map.values()) {
           HashSet<Character> set = new HashSet<>();
           for (int i = lst.get(0) + 1; i < lst.get(lst.size() - 1); i++) {
                if(set.contains(charArray[i])) continue;
                set.add(charArray[i]);
                k++;
           }
        }
        return k;
    }
}