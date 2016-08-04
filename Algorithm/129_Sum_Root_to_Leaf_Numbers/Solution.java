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
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }
    
    /**
     * 解体思路：
     * 
     * 一共二叉树的三种情况
     * 
     * 1. 空节点
     * 2. 叶子节点
     * 3. 一般节点（有子节点）
     * 
     * 
     * 私有方法 sumNumbers 的返回值，只有当节点是叶子节点的时候，才用来相加，如果不是叶子节点，则递归到叶子节点为止。
     * 
     * 父节点的值通过 preSum 变量来存储，下一级的参数就是 preSum*10 + node.val (当前node的val)
     * 
     */
    private int sumNumbers(TreeNode node, int preSum) {
        if (node == null) {
            return 0;
        } else if (node.left == null && node.right == null) {
            return preSum*10 + node.val;
        } else {
            return sumNumbers(node.left, preSum*10 + node.val) + sumNumbers(node.right, preSum*10 + node.val);
        }
    }
}
