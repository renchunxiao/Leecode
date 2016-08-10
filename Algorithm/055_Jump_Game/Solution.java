public class Solution {
    public boolean canJump(int[] A) {
       int ret = 0;// 表示可以跳到的最远距离
       // 循环数组每一个值，当 i 是数组下标，当 i <= ret 的时候代表，当前 i 的位置之前的步数可到达
       // 计算每一步可以跳的最大值，当前i位置的最大值就是 i(之前步数) + A[i] 的合。  
       for (int i = 0; i < A.length && i <= ret; i++) {
           ret = Math.max(ret, A[i] + i);
       }
       
       return ret >= A.length - 1;
    }
}

