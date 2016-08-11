public class Solution {
    public boolean isPowerOfFour(int num) {
        // 使用循环处理
        while (num > 0 && (num % 4 == 0)) {
            num = num / 4;
        }
        
        return num == 1;
    }
}
