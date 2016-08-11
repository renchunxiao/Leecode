public class Solution {
	// 因为1162261467是int类型最大的3的方数，所以判断n是不是3的方数，只需要用它除以n余数是0就是，不为0就不是
    public boolean isPowerOfThree(int n) {
         return (n > 0 && 1162261467 % n == 0);
    }
}
