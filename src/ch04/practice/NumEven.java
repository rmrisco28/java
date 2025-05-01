package ch04.practice;

import java.util.Scanner;

public class NumEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i == n) {
                    a += i;
                    System.out.print(i);
                } else if (i % 2 == 0) {
                    a += i;
                    System.out.print(i + "+");
                }
            }
        }
        System.out.println("=" + a);
    }
}
