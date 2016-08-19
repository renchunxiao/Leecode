public class Solution {
    public int titleToNumber(String s) {
        int ret = 0;
        int pow = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            ret = ret + (s.charAt(i) - 'A' + 1) * (int)Math.pow(26, pow++);
        }
        return ret;
    }
}
