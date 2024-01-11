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

     public int dif=0;
    
    public int maxAncestorDiff(TreeNode root) {
        if(root==null){
            return 0;
        }
       int max=root.val;
       int min=root.val;

        diff(root,max,min);

        return dif;

    }

    

    public void diff(TreeNode root,int max,int min){
       if(root==null){
           return;
       }

      dif=Math.max(dif,Math.max(Math.abs(min-root.val),Math.abs(max-root.val)));

    min=Math.min(min,root.val);
    max=Math.max(max,root.val);

    diff(root.left,max,min);
    diff(root.right,max,min);

    }
}
