public class Solution {
    public boolean isPowerOfThree(int n) {
        if (num > 1) {
            while (num % 3 == 0) {
                num = num / 3;
            }
        }
        return num == 1;
    }
}
