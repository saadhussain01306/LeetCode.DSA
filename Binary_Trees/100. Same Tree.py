# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        # If both trees are null, they are the same
        if not p and not q:
            return True
        
        # If one of the trees is null and the other is not, they are not the same
        if not p or not q:
            return False

        # Check if the values of the current nodes are the same
        if p.val != q.val:
            return False

        # Recursively check the left and right subtrees
        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
        
