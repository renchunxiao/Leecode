public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        int olength = haystack.length();
        int nlength = needle.length();
        int index = -1;
        A:for (int i = 0; i < olength; i++) {
            if (haystack.charAt(i) != needle.charAt(0)) {
                continue;
            } else {
                index = i;
                if (i + nlength > olength) {
                    return -1;
                }
                for (int j = 1; j < nlength; j++) {
                    if (needle.charAt(j) != haystack.charAt(i + j)) {
                        index = -1;
                        continue A;
                    }
                }
                return index;
            }
        }
        return index;
    }
}
