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
    public int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }

    public int height(TreeNode root) {
        if (root == null)
            return 0;
        
        int lefth = height(root.left);
        int righth = height(root.right);

        ans = Math.max(ans, lefth + righth);

        return Math.max(lefth, righth) + 1;
    }
}