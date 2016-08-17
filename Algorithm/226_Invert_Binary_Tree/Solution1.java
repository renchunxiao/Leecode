/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
public class Solution1 {
    //非递归
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(true) {
            if (stack.isEmpty()) break;
            TreeNode pushNode = stack.pop();
            TreeNode tmp = pushNode.left;
            pushNode.left = pushNode.right;
            pushNode.right = tmp;
            if (pushNode.left != null) stack.push(pushNode.left);
            if (pushNode.right != null) stack.push(pushNode.right);
        }
        
        return root;
    }
    
}
