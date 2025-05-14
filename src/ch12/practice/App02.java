package ch12.practice;

import java.util.Random;
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {
        // 가위바위보 만들기
        while (true) {
            System.out.println("가위바위보를 내세요");
            System.out.println("------------------------");
            System.out.println("1. 가위 | 2. 바위 | 3. 보");
            System.out.println("------------------------");
            // 입력받기
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            // 사람이 가위바위보 고르기
            int a = scanner.nextInt();
            while (a != 1 && a != 2) {
                System.out.println("다시 내세요");
                a = scanner.nextInt();
            }

        }


    }
}

