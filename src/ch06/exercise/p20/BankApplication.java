package ch06.exercise.p20;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Account[] accounts = new Account[100];
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        int a = 0;
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("1. 계좌 생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("---------------------------------------------------");
            System.out.print("선택 > ");
            Scanner s = new Scanner(System.in);
            a = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거
            switch (a) {
                case 1 -> {
                    System.out.println("-------");
                    System.out.println("계좌생성");
                    System.out.println("-------");

                    System.out.print("계좌번호: ");
                    String num = scanner.nextLine();
                    System.out.print("계좌주: ");
                    String name = scanner.nextLine();
                    System.out.print("초기 입금액: ");
                    int money = scanner.nextInt();

                    Account newAccount = new Account();
                    newAccount.setNum(num);
                    newAccount.setName(name);
                    newAccount.setMoney(money);
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    accounts[count++] = newAccount;

                }
                case 2 -> {
                    System.out.println("-------");
                    System.out.println("계좌 목록");
                    System.out.println("-------");
                    for (int i = 0; i < count; i++) {
                        System.out.println(accounts[i].getNum() + " " + accounts[i].getName() + " " + accounts[i].getMoney());
                    }
                }
                case 3 -> {
                    System.out.println("-------");
                    System.out.println("예금");
                    System.out.println("-------");
                    System.out.print("계좌번호: ");
                    String num = scanner.nextLine();
                    System.out.print("예금액: ");
                    int money = scanner.nextInt();
                    Account newAccount = new Account();
                    newAccount.setNum(num);
                    newAccount.setMoney(money);
                }

                case 4 -> {
                    System.out.println("-------");
                    System.out.println("예금");
                    System.out.println("-------");
                    System.out.print("계좌번호: ");
                    String num = scanner.nextLine();
                    System.out.print("출금액: ");
                    int money = scanner.nextInt();
                    Account newAccount = new Account();
                    newAccount.setNum(num);
                    newAccount.setMoney(-money);
                    System.out.println("결과: 출금이 성공되었습니다.");
                }
            }
        } while (a != 5);
        System.out.println("프로그램이 종료됩니다.");

    }
}
