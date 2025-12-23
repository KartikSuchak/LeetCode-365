class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            if (ch1 == '(' || ch1 == '{' || ch1 == '[') {
                stack.push(ch1);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char ch2 = stack.pop();
                if ((ch1 == ')' && ch2 != '(') || (ch1 == '}' && ch2 != '{') || (ch1 == ']' && ch2 != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}