public class Solution {
    // nSub1 代表 n-1 步的结果
    // nSub2 代表 n-2 步的结果
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int nSub1 = 2;
        int nSub2 = 1;
        int now = 0;
        for (int i = 3; i <= n; i++) {
            now = nSub1 + nSub2;
            nSub2 = nSub1;
            nSub1 = now;
        }
        return now;
    }
}
