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
    public int pseudoPalindromicPaths (TreeNode root) {
        return countPseudoPalindromicPaths(root, 0);
    }

    private static int countPseudoPalindromicPaths(TreeNode node, int xor) {
        if (node == null) {
            return 0;
        }

        xor ^= (1 << node.val);

        if (node.left == null && node.right == null) {
            // Check if the current path is pseudo-palindromic
            return (xor & (xor - 1)) == 0 ? 1 : 0;
        }

        int leftCount = countPseudoPalindromicPaths(node.left, xor);
        int rightCount = countPseudoPalindromicPaths(node.right, xor);

        return leftCount + rightCount;
    }
}
