package easy;

import java.util.Stack;

public class ValidParentheses {
    private static final int OPEN_PARENTHESIS = '(';
    private static final int OPEN_BRACKET = '[';
    private static final int OPEN_BRACE = '{';
    private static final int CLOSE_PARENTHESIS = ')';
    private static final int CLOSE_BRACKET = ']';
    private static final int CLOSE_BRACE = '}';

    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        if (charArray.length % 2 != 0) return false;
        Stack<Integer> openStack = new Stack<>();
        for (char current : charArray) {
            if (current == OPEN_BRACE || current == OPEN_BRACKET || current == OPEN_PARENTHESIS) {
                openStack.push((int) current);
            } else {
                if (openStack.isEmpty()) return false;
                Integer latest = openStack.pop();
                switch (latest) {
                    case OPEN_PARENTHESIS:
                        if (current != CLOSE_PARENTHESIS) return false;
                        break;
                    case OPEN_BRACKET:
                        if (current != CLOSE_BRACKET) return false;
                        break;
                    case OPEN_BRACE:
                        if (current != CLOSE_BRACE) return false;
                        break;
                    default:
                        return false;
                }
            }
        }
        return openStack.isEmpty();
    }

}
