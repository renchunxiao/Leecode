public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String first = strs[0];
        String ret = "";
        
        for (int i = 0; i < first.length(); i++) {
            char tmp = first.charAt(i);
            
            boolean isCommon = false;
            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length() - 1) {
                    isCommon = false;
                    break;
                } else {
                    isCommon = (tmp == strs[j].charAt(i));
                    if (!isCommon) {
                        break;
                    }
                }
            }
            
            if (isCommon) {
                ret = ret + tmp;
            } else {
                break;
            }
        }
        
        return ret;
    }
}
