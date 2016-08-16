public class Solution {
    public boolean isPalindrome(String s) {
		if (s == null || s.length() == 0) return true;
	    for (int i = 0, j = s.length()-1; j >= i;) {
	        if(!isValid(s.charAt(i))) {
	            i++;
	            continue;
	        }
	        if(!isValid(s.charAt(j))) {
	            j--;
	            continue;
	        }
	        if (!isSame(s.charAt(i), s.charAt(j))) return false;
	        i++;
	        j--;
	    }
	    
	    return true;
	}

	private boolean isValid(char c) {
        	if(c>='a' && c<='z' || c>='A' && c<='Z' || c>='0' && c<='9')  
                   return true;  
                return false; 
	}
	
	private boolean isSame(char c1, char c2) {
		if (c1 >= 'A' && c1 <= 'Z')
			c1 = (char) (c1 - 'A' + 'a');
		if (c2 >= 'A' && c2 <= 'Z')
			c2 = (char) (c2 - 'A' + 'a');
		return c1 == c2;
	}
}
