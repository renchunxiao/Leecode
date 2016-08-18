/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (root.left==null && root.right==null){  
            return true;  
        }  
        if (Math.abs(findMaxDepth(root.left) - findMaxDepth(root.right)) > 1) {
            return false;
        }
        
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    
    private int findMaxDepth(TreeNode node) {
        if (node == null) return 0;
        
        return 1 + Math.max(findMaxDepth(node.left), findMaxDepth(node.right));
    }
}
