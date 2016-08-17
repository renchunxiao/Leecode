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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        
        while(!queue.isEmpty()) {
            List<TreeNode> list = new ArrayList<TreeNode>();
            while(!queue.isEmpty()) {
                list.add(queue.poll());
            }
            for (int i = 0, j = list.size()-1; j > i; i++, j--) {
                if (list.get(i) == null && list.get(j) == null) {
                    continue;
                }
                if (list.get(i) == null && list.get(j) != null) {
                    return false;
                }
                if (list.get(i) != null && list.get(j) == null) {
                    return false;
                }
                if (list.get(i).val != list.get(j).val) {
                    return false;
                }
            }
            for (TreeNode node : list) {
                if (node != null) {
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
        }
        
        return true;
    }
}
