//发现所有行的重复周期都是 2 * nRows - 2
//周期中间的规律 2 * nRows - 2 - 2 * i 
public class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();  
        if (len == 0 || numRows < 2) return s;
        int lag = 2 * numRows - 2;
        String ret = "";
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < len; j = j + lag) {
                ret = ret + s.charAt(j);
                if (i > 0 && i < numRows - 1) {
                    int tmp = j + lag - 2 * i;
                    if (tmp < len) {
                        ret = ret + s.charAt(tmp);
                    }
                }
            }
            
        }
        return ret;
    }
}
