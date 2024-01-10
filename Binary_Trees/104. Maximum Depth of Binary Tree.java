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
    public int maxDepth(TreeNode root) {
        if(root == null ) return 0;
        
        else if(root.left==null && root.right==null){
            return 1;
        }


        else{
            int left_height=maxDepth(root.left);
            int right_height=maxDepth(root.right);

      if(left_height>right_height) {
           return left_height+1;
         }

      else{
          return right_height+1;
        }


        }
    }
}
