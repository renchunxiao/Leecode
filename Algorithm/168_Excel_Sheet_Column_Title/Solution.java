public class Solution {
    public String convertToTitle(int n) {
		String ret = "";
		while (n > 0) {
		    int r = n % 26;
		    n = n / 26;
		    if (r == 0) {
		        ret = "Z" + ret;
		        n--;
		    } else {
		        ret = (char)('A' + (r - 1)) + ret;
		    }
		}
		return ret;
    }
}
