package leetCode.p20;

import java.util.Stack;

public class solo {
    public static void main(String[] args) {
        String s = "()";
        boolean b;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) b = false;

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    b = false;
                }
            }
        }
        System.out.println(stack.isEmpty());
        System.out.println(stack);
    }

}

