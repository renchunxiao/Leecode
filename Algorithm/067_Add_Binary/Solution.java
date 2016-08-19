public class Solution {
    public String addBinary(String a, String b) {
        if (b.length() > a.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }
        
        int al = a.length();
        int bl = b.length();
        
        String ret = "";
        int carry = 0;
        for (int i = al - 1, j = bl - 1; i >= 0; i--, j--) {
	    int sum = 0;
            if (j < 0) {
                sum = (a.charAt(i) - '0') + carry;
            } else {
                sum = (a.charAt(i) - '0') + (b.charAt(j) - '0') + carry;
            }
            ret = sum % 2 + ret;
            carry = sum / 2;
        }
        if (carry == 1) {
            ret = "1" + ret;
        }
        return ret;
    }
}
