public class Solution {
    public int lengthOfLastWord(String s) {
     	if (s == null || s.length() == 0) {
            return 0;
        }   
        int r = 0;
        for (int i = (s.length() -1); i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                r++;
            }
            if (s.charAt(i) == ' ' && r != 0) {
                return r;
            }
        }
        return r;
    }
}
