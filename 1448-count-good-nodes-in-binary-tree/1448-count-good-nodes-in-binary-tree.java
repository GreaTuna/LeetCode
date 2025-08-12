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
    private int goodNodes = 0;

    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        countGoodNodes(root, root.val);
        return goodNodes;
    }

    private void countGoodNodes(TreeNode node, int max) {
        if (node.val >= max) {
            max = node.val;
            ++goodNodes;
        }

        if (node.left != null) countGoodNodes(node.left, max);
        if (node.right != null) countGoodNodes(node.right, max);
    }
}