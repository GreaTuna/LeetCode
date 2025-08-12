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
        countGoodNodes(root, root.val);
        return goodNodes;
    }

    private void countGoodNodes(TreeNode node, int max) {
        if (node == null) {
            return;
        }
        if (node.val >= max) {
            max = node.val;
            ++goodNodes;
        }
        countGoodNodes(node.left, max);
        countGoodNodes(node.right, max);
    }
}