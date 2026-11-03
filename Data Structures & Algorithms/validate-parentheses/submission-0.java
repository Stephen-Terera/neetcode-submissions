class Solution {
    public boolean isValid(String s) {
        Deque<Character> parentheses = new ArrayDeque<>();

        for (char c : s.toCharArray()){
            if (c == '(') parentheses.push(')');
            else if (c == '[') parentheses.push(']');
            else if (c == '{') parentheses.push('}');
            else if (parentheses.isEmpty() || parentheses.pop() != c ){
                return false;
            }
        }

        return parentheses.isEmpty();

        
    }
}
