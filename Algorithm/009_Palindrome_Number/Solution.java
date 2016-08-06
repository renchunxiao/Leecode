public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        }

        int r = 0;
        int t = x;
        while(x != 0) {
            r = r*10 + x % 10;
            x = x / 10;
        }
        return r == t;
    }
}
