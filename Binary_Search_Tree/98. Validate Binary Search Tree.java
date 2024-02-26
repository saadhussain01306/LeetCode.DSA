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
        List<Integer> list =new ArrayList<>();
        helper(root,list);

        int prev=list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i)<=prev){
                return false;
            }
            prev=list.get(i);
        }

        return true;
    }


    private void helper(TreeNode node ,List<Integer> list){
        if(node==null){
            return;
        }
        helper(node.left,list);
        list.add(node.val);
        helper(node.right,list);
    }
}
