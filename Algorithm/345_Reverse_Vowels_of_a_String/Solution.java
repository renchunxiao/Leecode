public class Solution {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        for (int i = 0, j = array.length - 1; i < j;) {
            if (isVowels(array[i]) && isVowels(array[j])) {
                char tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            } else if (isVowels(array[i]) && !isVowels(array[j])) {
                j--;
            } else if (!isVowels(array[i]) && isVowels(array[j])) {
                i++;
            } else if (!isVowels(array[i]) && !isVowels(array[j])) {
                i++;
                j--;
            }
        }
        return new String(array);
    }
    
    private boolean isVowels(char c) {
        return c == 'a' || c == 'e' || c == 'u' || c == 'i' || c == 'o' || c == 'A' || c == 'E' || c == 'U' || c == 'I' || c == 'O'; 
    }
}
