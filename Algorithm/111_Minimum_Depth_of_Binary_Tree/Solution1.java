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
    public int minDepth(TreeNode root) {
        if (root == null) 
            return 0;
        int ret = depth(root, 0);
        return ret;
    }
    //递归实现
    public int depth(TreeNode node, int depth) {
        if (node.left == null && node.right == null) 
            return depth + 1;
            
        if (node.left != null && node.right != null) {
            return Math.min(depth(node.left, depth + 1), depth(node.right, depth + 1));
        }
        
        if (node.left != null) {
            return depth(node.left, depth + 1);
        } else {
            return depth(node.right, depth + 1);
        }
    }
}
