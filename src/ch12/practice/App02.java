package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App02 {
    public static void main(String[] args) {
        // 사용자로부터 입력받아서
        Scanner scanner = new Scanner(System.in);

        // 한글 3글자 이상인지 확인하는 코드
        while (true) {
            System.out.println("한글 3글자 이상 적어주세요");
            System.out.print("입력 대기 > ");
            String a = scanner.nextLine();
            System.out.println(a);
            if ((Pattern.matches("[가-힣]{3,}", a))) {
                System.out.println("수고하셨습니다.");
                break;
            } else {
                System.out.println("다시 입력해주세요");
                System.out.println();
            }

        }


    }
}

