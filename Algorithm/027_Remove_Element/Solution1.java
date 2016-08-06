public class Solution {
    //因为，留下的数字，可以不用考虑顺序，所以
    //下面的这个解法，就是把数组当中的 val 从后面替换到前面。
    public int removeElement(int[] A, int elem) {
        int l = A.length;
        for (int i=0; i<l; i++) {
            if (A[i] == elem) {
                A[i--] = A[l-- -1];
            }
        }
        return l;
    }
}
