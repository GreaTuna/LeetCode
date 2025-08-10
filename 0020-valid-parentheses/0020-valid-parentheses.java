class Solution {
    private static final HashMap<Character, Character> map = new HashMap<>();
    static {
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');
    }

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}