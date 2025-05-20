package ch15.lecture.p04stack;

import java.util.Stack;

public class App01 {
    public static void main(String[] args) {
        // stack(LIFO)
        // 마지막에 들어간 객체가 먼저 나온다.

        Stack<String> stack = new Stack<>();
        // push: 추가
        stack.push("java");
        stack.push("spring");
        stack.push("react");
        stack.push("java");
        stack.push("css");
        // 중복해서 저장 가능.
        System.out.println(stack);


        // pop: 꺼내기
        String e1 = stack.pop();
        System.out.println("e1 = " + e1);
        String e2 = stack.pop();
        System.out.println("e2 = " + e2);
        System.out.println(stack);
        // 나중에 넣은 자료를 제거.

        // peek: 가장 위에 있는 객체 보기
        // 왜 위에 있는 표현을  썼는지?
        String e3 = stack.peek();
        System.out.println("e3 = " + e3);
        System.out.println(stack);

        //
    }
}
