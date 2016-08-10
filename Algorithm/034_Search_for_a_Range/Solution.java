public class Solution {
    // 最坏的情况是O(n)的复杂度,即数组元素全一样，并且等于 target
    public int[] searchRange(int[] A, int target) {
	// 先用2分查找，查找到一个指定的位置
        int pos = searchTarget(A, target, 0, A.length -1);
        if (pos == -1) return new int[]{-1,-1};
         
        int start = 0;
        int end = A.length - 1;
	
	// 然后从这个位置向前匹配，直到不等于target
        for (int i = pos - 1; i >= 0; i--) {
            if (A[i] != target) {
                start = i+1;
                break;
            }              
        }
	// 然后从这个位置向后匹配，直到不等于target
        for (int i = pos + 1; i < A.length; i++) {
            if (A[i] != target) {
                end = i - 1;
                break;
            }
        }
        return new int[]{start,end};
    }
     
    public int searchTarget(int[] A, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (A[mid] == target) return mid;
        if (A[mid] > target) return searchTarget(A, target, left, mid -1);
        else return searchTarget(A, target, mid+1, right);     
    }
}
