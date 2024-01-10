/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int maxDepth(struct TreeNode* root) {
    if(root==NULL) return 0; 
    else if(root->left==NULL && root->right==NULL){
        return 1;
    }

    else{
        int lh=maxDepth(root->left);
        int rh=maxDepth(root->right);
        if(lh>rh){
            return (lh+1);
        }
        else{
            return(rh+1);
        }
  }

}
