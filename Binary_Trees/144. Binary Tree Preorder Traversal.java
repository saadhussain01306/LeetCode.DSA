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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
             find(list,root);
             return list;  
    }
    public void find(List<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        else{
        
        list.add(root.val);
        find(list,root.left);
        find(list,root.right);
       }
    }
}
