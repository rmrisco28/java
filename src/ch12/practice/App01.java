package ch12.practice;

import java.util.Random;
import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        // 입력받기
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 가위바위보 만들기
        int a;
        int x;
        Loop1:
        while (true) {
            System.out.println("----가위바위보를 내세요-----");
            System.out.println("1. 가위 | 2. 바위 | 3. 보");
            System.out.println("------------------------");
            System.out.print("입력해주세요 >");
            // 사람이 가위바위보 고르기
            a = scanner.nextInt();
            Loop2:
            while (a != 1 && a != 2 && a != 3) {
                System.out.println("잘못냈습니다. 다시 내주세요.");
                a = scanner.nextInt();
            }

            if (a == 1) {
                System.out.print("가위");
            } else if (a == 2) {
                System.out.print("바위");
            } else {
                System.out.print("보");
            }

            // 컴퓨터가 가위바위보 고르기
            x = random.nextInt(3) + 1;
            if (x == 1) {
                System.out.println(" VS 가위");
            } else if (x == 2) {
                System.out.println(" VS 바위");
            } else {
                System.out.println(" VS 보");
            }
            // 비교 하기
            if (a == x) {
                System.out.println("비겼습니다. 다시하세요.");
                System.out.println();
            } else if ((a == 1 && x == 3) || (a == 2 && x == 1) || (a == 3 && x == 2)) {
                System.out.println("🎊🥳🎆🥳🎇축하합니다 🥳🥳🎆🥳이겼습니다.🥳🎇🥳🥳🎆🎊");
                break;
            } else {
                System.out.println("졌습니다. 다시하세요");
                System.out.println();
            }
        }
    }
}
