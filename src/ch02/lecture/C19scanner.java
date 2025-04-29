package ch02.lecture;

import java.util.Scanner;

public class C19scanner {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        // 커서를 이동하면서 입력된 값을 읽어냄
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println("s = " + s);

        String t = scanner.next();

        System.out.println("t = " + t);

        
        System.out.println("프로그램 종료");

    }
}
