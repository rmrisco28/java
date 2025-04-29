package ch02.lecture;

import java.util.Scanner;

public class C21scanner {
    public static void main(String[] args) {
        System.out.println("두 값을 더하는 프로그램");
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 값 ");
        String n = scanner.nextLine();

        System.out.print("두번째 값 ");
        String m = scanner.nextLine();

        int i = Integer.parseInt(n);
        int j = Integer.parseInt(m);

        int r = i + j;
        System.out.println("더한 값 = " + r);

        System.out.println("프로그램 종료");

    }
}
