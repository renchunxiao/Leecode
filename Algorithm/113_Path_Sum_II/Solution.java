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
    
    private List<List<Integer>> ret = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> path = new ArrayList<Integer>();
        
        pathSum(root, sum, path);
        
        return ret;   
    }
    
    private void pathSum(TreeNode root, int sum, List<Integer> pathed) {
        if (root == null) {
            return;
        }
        List<Integer> path = new ArrayList<Integer>(pathed);
        path.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            ret.add(path);
            return;
        }
        pathSum(root.left, sum - root.val, path);
        pathSum(root.right, sum - root.val, path);
    }
    
}
