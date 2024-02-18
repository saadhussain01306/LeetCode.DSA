/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool isSameTree(struct TreeNode* p, struct TreeNode* q) {
    // If both trees are null, they are the same
    if (p == NULL && q == NULL) {
        return true;
    }

    // If one of the trees is null and the other is not, they are not the same
    if (p == NULL || q == NULL) {
        return false;
    }

    // Check if the values of the current nodes are the same
    if (p->val != q->val) {
        return false;
    }

    // Recursively check the left and right subtrees
    return isSameTree(p->left, q->left) && isSameTree(p->right, q->right);
}
