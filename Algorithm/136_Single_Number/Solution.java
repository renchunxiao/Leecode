public class Solution {
    //使用异或运算
    public int singleNumber(int[] nums) {
        int r = 0;
        for (int num : nums) {
            r = r ^ num;
        }
        return r;
    }
}
