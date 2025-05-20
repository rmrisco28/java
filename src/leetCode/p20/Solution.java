package leetCode.p20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) { // 각문자를 배열로 만들어서 문자별로들어간다.
            // 열린 괄호면 stack에 push

            // 닫힌 괄호면
            // stack 에서 pop 한것과 비교
            // 매치가 되면 계속 진행, 아니면 return false
            switch (c) {
                case ']' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char open = stack.pop();
                    if (open != '[') {
                        return false;
                    }

                }
                case '}' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char open = stack.pop();
                    if (open != '{') {
                        return false;
                    }
                }
                case ')' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char open = stack.pop();
                    if (open != '(') {
                        return false;
                    }
                }
                default -> {
                    stack.push(c);
                }
            }

        }
        return stack.isEmpty();

    }
}
