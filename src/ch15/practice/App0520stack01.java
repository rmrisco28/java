package ch15.practice;

import java.util.Stack;

public class App0520stack01 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("naver.com");
        stack.push("daum.net");
        stack.push("google.com");

        System.out.println("현재 페이지 " + stack.peek());
        System.out.println("뒤로가기");
        System.out.println("이전 페이지 " + stack.pop());
    }
}
