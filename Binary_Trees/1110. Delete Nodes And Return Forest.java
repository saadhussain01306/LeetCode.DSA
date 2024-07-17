/*
Given the root of a binary tree, each node in the tree has a distinct value.

After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint union of trees).

Return the roots of the trees in the remaining forest. You may return the result in any order.

 

Example 1:


Input: root = [1,2,3,4,5,6,7], to_delete = [3,5]
Output: [[1,2,null,4],[6],[7]]
Example 2:

Input: root = [1,2,4,null,3], to_delete = [3]
Output: [[1,2,4]]
 

Constraints:

The number of nodes in the given tree is at most 1000.
Each node has a distinct value between 1 and 1000.
to_delete.length <= 1000
to_delete contains distinct values between 1 and 1000.
*/

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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> result = new ArrayList<>();
        if (root == null) return result;

        Set<Integer> toDeleteSet = new HashSet<>();
        for (int val : to_delete) {
            toDeleteSet.add(val);
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curNode = queue.poll();

            if (curNode.left != null) {
                queue.offer(curNode.left);
                if (toDeleteSet.contains(curNode.left.val)) {
                    curNode.left = null;
                }
            }

            if (curNode.right != null) {
                queue.offer(curNode.right);
                if (toDeleteSet.contains(curNode.right.val)) {
                    curNode.right = null;
                }
            }

            if (toDeleteSet.contains(curNode.val)) {
                if (curNode.left != null) {
                    result.add(curNode.left);
                }
                if (curNode.right != null) {
                    result.add(curNode.right);
                }
            } else if (result.isEmpty()) {
                result.add(curNode);
            }
        }

        return result;
    }
}
