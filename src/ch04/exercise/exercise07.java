package ch04.exercise;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner moneyScanner = new Scanner(System.in);

        boolean go = true;
        int money = 0;

        do {
            System.out.println("--------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("--------------------------------------");
            System.out.println("선택");
            System.out.print("> ");
            String strNum = scanner.nextLine();

            switch (strNum) {
                case "1" -> {
                    System.out.print("예금액> ");
                    money += moneyScanner.nextInt();
                    System.out.println("입금 되었습니다.");
                }
                case "2" -> {
                    System.out.print("출금액> ");
                    money -= moneyScanner.nextInt();
                    System.out.println("출금 되었습니다.");
                }
                case "3" -> {
                    System.out.print("잔액> ");
                    System.out.println(money);
                }
                case "4" -> {
                    System.out.println("프로그램 종료");
                    go = false;
                }
                default -> {
                    System.out.println("다시 입력하세요.");
                }
            }
        } while (go);
    }
}
