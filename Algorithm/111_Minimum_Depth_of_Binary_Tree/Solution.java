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
        //非递归算法，层次遍历树，找到第一个叶子节点就返回 
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        int level = 0;
        int lastNum = 1;
        int currentNum = 0;
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left == null && node.right == null) {
                return level + 1;
            }
            lastNum--;
            
            if (node.left != null) {
                queue.offer(node.left);
                currentNum++;
            }
            if (node.right != null) {
                queue.offer(node.right);
                currentNum++;
            }
            
            if (lastNum == 0) {
                level++;
                lastNum = currentNum;
                currentNum = 0;
            }
        }    
        return level;
    }
    
}
