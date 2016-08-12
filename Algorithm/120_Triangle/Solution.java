public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] rev = new int[triangle.size()];
        
        for (int i = 0; i < rev.length; i++) {
            rev[i] = triangle.get(triangle.size() - 1).get(i);
        }
        
        
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                rev[j] = Math.min((triangle.get(i).get(j) + rev[j]), (triangle.get(i).get(j) + rev[j+1]));                
            }
        }
        
        return rev[0];
    }
}
