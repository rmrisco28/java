package ch04.lecture;

import java.util.Scanner;

public class c10ifswitch {
    public static void main(String[] args) {
        // switch 값== 비교
        // 값이 맞는지 비교할때 사용.
        Scanner scanner = new Scanner(System.in);
        System.out.println("등급");
        String grade = scanner.nextLine();

        if (grade.equals("A") || grade.equals('a')) {
            System.out.println("최우수");
        } else if (grade.equals("B") || grade.equals('b')) {
            System.out.println("우수");
        } else if (grade.equals("C") || grade.equals('c')) {
            System.out.println("양호");
        } else {
            System.out.println("미흡");
        }
    }
}
