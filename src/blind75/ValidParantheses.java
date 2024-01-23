package blind75;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParantheses {

    public static void main(String[] args) {
        String s = "()[{]{}";
        boolean i = isValid(s);
        System.out.println(i);
    }

    private static final String OPEN_BRACKETS = "([{";
    private static final String CLOSING_BRACKETS = ")]}";

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isOpeningBracket(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !isMatching(c, stack.pop())) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpeningBracket(char c) {
        return OPEN_BRACKETS.indexOf(c) != -1;
    }

    private static boolean isMatching(char open, char close) {
        return OPEN_BRACKETS.indexOf(open) == CLOSING_BRACKETS.indexOf(close);
    }
}

