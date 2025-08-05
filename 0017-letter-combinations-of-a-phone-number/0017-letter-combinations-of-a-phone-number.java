class Solution {

    static class TreeNode {
        public Character val;
        final List<TreeNode> children = new ArrayList<>();

        public TreeNode(Character val) {
            this.val = val;
        }
    }

    private static final HashMap<Character, Character[]> map = new HashMap<>();

    static {
        map.put('2', new Character[]{'a', 'b', 'c'});
        map.put('3', new Character[]{'d', 'e', 'f'});
        map.put('4', new Character[]{'g', 'h', 'i'});
        map.put('5', new Character[]{'j', 'k', 'l'});
        map.put('6', new Character[]{'m', 'n', 'o'});
        map.put('7', new Character[]{'p', 'q', 'r', 's'});
        map.put('8', new Character[]{'t', 'u', 'v'});
        map.put('9', new Character[]{'w', 'x', 'y', 'z'});
    }

    private void fillTree(TreeNode node, String digits, int index) {
        if (node == null || index >= digits.length()) {
            return;
        }

        Character[] arr = map.get(digits.charAt(index));
        List<TreeNode> children = node.children;

        for (Character c : arr) {
            children.add(new TreeNode(c));
        }

        for (TreeNode child : children) {
            fillTree(child, digits, index + 1);
        }
    }

    private List<String> getAllCombinations(TreeNode node) {
        if (node == null) {
            return new ArrayList<>();
        }

        if (node.children.isEmpty()) {
            return List.of(Character.toString(node.val));
        }

        List<String> result = new ArrayList<>();

        for (TreeNode child : node.children) {
            for (String s : getAllCombinations(child)) {
                if (node.val != null) {
                    result.add(node.val + s);
                } else {
                    result.add(s);
                }
            }
        }
        return result;
    }

    public List<String> letterCombinations(String digits) {
        TreeNode root = !digits.isEmpty() ? new TreeNode(null) : null;
        fillTree(root, digits, 0);
        return getAllCombinations(root);
    }
}