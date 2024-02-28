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
    public int findBottomLeftValue(TreeNode root) {
        // we will do level order traversal in this manner  righ element->left
        // finally we will be left out with the leftmost element in the last of the queue

        // in a situation where we have only a rightmost element in the last row we return the same
        TreeNode leftmost=null;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            leftmost=queue.poll();//removes and returns the head of the queue 

            if(leftmost.right!=null){
                queue.offer(leftmost.right);
            }
            if(leftmost.left!=null){
                queue.offer(leftmost.left);
            }
        }

        return leftmost.val;
    }
}
