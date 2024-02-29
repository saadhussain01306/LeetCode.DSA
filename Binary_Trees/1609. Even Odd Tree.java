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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null){
            return true;
        }
         Queue<TreeNode> q= new LinkedList<>();
         boolean iseven=true;
         q.offer(root);

         while(q.size()>0){
             int size=q.size();
             int prev=iseven?Integer.MIN_VALUE:Integer.MAX_VALUE;

             while(size>0){
                 root=q.poll();
                 if(iseven && (root.val%2==0 || root.val<=prev)) return false;//for the even level
                 if(!iseven && (root.val%2==1 || root.val>=prev)) return false;//for the odd level
                 prev=root.val;
                 if(root.left!=null){
                     q.offer(root.left);//add the left node first
                 }
                 if(root.right!=null){
                     q.offer(root.right);//add the right node afterwards
                 }

                 size--;
                 
             }
             iseven=!iseven;//change the even to odd level and vice versa
         }


         return true;

    }
}
