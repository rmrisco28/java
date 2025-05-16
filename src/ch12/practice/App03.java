package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App03 {
    public static void main(String[] args) {
        // 사용자 입력 받아서

        // 유효한 전화번호인지 확인

        // 아래 전화번호들은 패턴에 일치하는것들
        // 01099998888
        // 010-9999-8888
        // 010 9999 8888
        // 010-99998888
        // 010 99998888
        Scanner scanner = new Scanner(System.in);
//            String r = "010(\\d{4}| \\d{4}|-\\d{4})(\\d{4}| \\d{4}|-\\d{4})";
        String s = "010[ -]?(\\d{4})[ -]?(\\d{4})";
        while (true) {
            System.out.println("전화번호를 입력해주세요.");
            String n = scanner.nextLine();
            boolean m = Pattern.matches(s, n);
            if (m) {
                System.out.println("유효한 전화번호.");
                break;
            } else {
                System.out.println("유효하지 않는 전화번호");
            }

        }


    }
}
