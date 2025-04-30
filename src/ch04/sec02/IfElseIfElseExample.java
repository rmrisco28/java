package ch04.sec02;

import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수: ");
        String line = scanner.nextLine();

        //int score = 75;

        // 100 초과 또는 0 미만 일 경우,
        // 점수를 바르게 입력하세요 출력
        int score = Integer.parseInt(line);
        if (score > 100 || score < 0) {
            System.out.println("점수를 바르게 입력하세요.");
        } else if (score >= 90) {
            System.out.println("점수가 100~90점 입니다.");
            System.out.println("등급은 A입니다.");
        } else if (score >= 80) {
            System.out.println("점수가 90~80점 입니다.");
            System.out.println("등급은 B입니다.");
        } else if (score >= 70) {
            System.out.println("점수가 80~70점 입니다.");
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("점수가 70미만 입니다.");
            System.out.println("등급은 D입니다.");
        }
    }
}
