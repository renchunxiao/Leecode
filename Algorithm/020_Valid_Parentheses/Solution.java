public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char iChar = s.charAt(i);
            if (iChar == '(' || iChar == '{' || iChar == '[') {
                stack.push(s.charAt(i));
            }
            if (iChar == ')' || iChar == '}' || iChar == ']') {
                if (stack.empty()) {
                    return false;
                }
                char tmp = stack.pop();
                if (!is_valid(tmp, iChar)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private boolean is_valid(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}')
            || (c1 == '[' && c2 == ']');
    }
}
