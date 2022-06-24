import java.util.HashMap;
import java.util.Stack;
public class Solution1 {
    public boolean isValid(String s) {
        Stack<Character> char_stack = new Stack();
        HashMap<Character, Character> char_hashmap = new HashMap<Character, Character>();
        char_hashmap.put(')', '(');
        char_hashmap.put(']', '[');
        char_hashmap.put('}', '{');
        for (char c : s.toCharArray()) {
            if (char_hashmap.containsKey(c)) {
                if (!char_stack.isEmpty() && char_stack.peek() == char_hashmap.get(c)) {
                    char_stack.pop();
                } else {
                    return false;
                }
            } else {
                char_stack.push(c);
            }
        }
        return char_stack.isEmpty();
    }
}
