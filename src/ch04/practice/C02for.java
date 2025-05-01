package ch04.practice;

public class C02for {
    public static void main(String[] args) {
        /*
        0
        1
        2
        3
        4
        */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        /*
        1
        2
        3
        4
        5
        */
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        /*
        0 2 4 6 8 */
        // 2 4 6 8 10
        // 43210
        // 54321
        // *****
        System.out.println("--------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(i * 2);
        }
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * 2);
        }
        System.out.println("--------------------");
        for (int i = 4; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("*");
        }
        System.out.println("--------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i + "홀수");
            }
        }
    }
}