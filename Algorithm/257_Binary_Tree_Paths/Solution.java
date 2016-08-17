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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList<String>();
        binaryTreePaths(root, ret, "");
        return ret;
    }
    
    private void binaryTreePaths(TreeNode node, List<String> ret, String path) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            path = path + node.val;
            ret.add(path);
            return;
        }
        binaryTreePaths(node.left, ret, path + node.val + "->");
        binaryTreePaths(node.right, ret, path + node.val + "->");
    }
}
