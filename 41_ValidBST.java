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
    public boolean isValidBST(TreeNode root) {
        return validTree(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean validTree(TreeNode node, long left, long right) {
        if (node == null) {
            return true;
        }
        boolean checkLeft = left < node.val;
        boolean checkRight = right > node.val;
        if (!(checkLeft && checkRight)) {
            return false;
        }
        return validTree(node.left, left, node.val) && validTree(node.right, node.val, right);
    }
}
