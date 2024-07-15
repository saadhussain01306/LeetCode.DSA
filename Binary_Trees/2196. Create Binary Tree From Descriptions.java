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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashSet<Integer> child_nodes=new HashSet<>();
        HashMap<Integer,TreeNode>map=new HashMap<>();

        for(int des[]:descriptions){
            //add parents to the hashmap
            if(!map.containsKey(des[0])){
                map.put(des[0],new TreeNode(des[0]));
            }

            //for child
            if(!map.containsKey(des[1])){
                map.put(des[1],new TreeNode(des[1]));
            }

            //add childs to the nodes
            if(des[2]==1){
                map.get(des[0]).left=map.get(des[1]);
            }
            else{
                map.get(des[0]).right=map.get(des[1]);
            }
            child_nodes.add(des[1]);
        }

        for(int[] des:descriptions){
            if(!child_nodes.contains(des[0])){
                return map.get(des[0]);
            }
        }

        return null;//no parent node
    }
}
