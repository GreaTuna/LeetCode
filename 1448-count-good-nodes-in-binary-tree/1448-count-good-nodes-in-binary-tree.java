/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int goodNodes = 0;
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair(root, root.val));

        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> pair = queue.poll();
            TreeNode node = pair.getKey();
            int maxValue = pair.getValue();

            if (node.val >= maxValue) {
                ++goodNodes;
            }

            int max = Math.max(maxValue, node.val);
            if (node.left != null) queue.add(new Pair(node.left, max));
            if (node.right != null) queue.add(new Pair(node.right, max));
        }
        
        return goodNodes;
    }
}