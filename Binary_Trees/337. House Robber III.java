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
public class Solution {
    public int rob(TreeNode root) {
        int[] result = robSubtree(root);
        return Math.max(result[0], result[1]);
    }

    // Helper function to calculate the maximum amount of money that can be robbed
    // from the subtree rooted at the given node.
    private int[] robSubtree(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        // result[0] represents the maximum amount if the current node is not robbed
        // result[1] represents the maximum amount if the current node is robbed
        int[] result = new int[2];

        // Recursively calculate the maximum amount for the left and right subtrees
        int[] left = robSubtree(node.left);
        int[] right = robSubtree(node.right);

        // If the current node is not robbed, the maximum amount is the sum of the
        // maximum amounts from the left and right subtrees
        result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        // If the current node is robbed, the maximum amount is the sum of the values
        // of the current node, the unrobbed values from the left and right subtrees
        result[1] = node.val + left[0] + right[0];

        return result;
    }
}
