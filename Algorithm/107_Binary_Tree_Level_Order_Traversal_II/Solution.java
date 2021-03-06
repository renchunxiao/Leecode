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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> ret = new LinkedList<List<Integer>>();
        if (root == null) return ret;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            List<TreeNode> tmpNodes = new ArrayList<TreeNode>();
            List<Integer> data = new ArrayList<Integer>();
            
            int size = queue.size();
            for(int i = 0; i <size; i++) {
                TreeNode node = queue.remove();
                data.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            
            ret.addFirst(data);
        }
        
        return ret;
    }
    
    
}
