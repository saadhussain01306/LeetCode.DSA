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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzag=new ArrayList<>();
        if(root==null){
            return zigzag;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            Stack<Integer> reverse_stack= new Stack<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();//peek element of the queue
                if(flag){
                    reverse_stack.add(node.val);
                }
                else{
                    level.add(node.val);
                }

                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                
            }
            flag=!flag;//reverse the condition 
            while(!reverse_stack.isEmpty()){
                level.add(reverse_stack.pop());
            }
            zigzag.add(level);
        }

        return zigzag;
    }
}
