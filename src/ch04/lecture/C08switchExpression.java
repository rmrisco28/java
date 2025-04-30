package ch04.lecture;

public class C08switchExpression {
    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("code!");
            case 2:
                System.out.println("code@");
            case 3:
                System.out.println("code#");
        }


        switch (a) {
            case 1 -> {
                System.out.println("code!");
                System.out.println("code!");
            }
            case 2 -> System.out.println("code@");
            case 3 -> System.out.println("code#");
        }

        // old style
        switch (a) {
            case 1:
            case 2:
                System.out.println("code$");
            case 4:
            case 3:
                System.out.println("code^");
            case 5:
            case 6:
                System.out.println("code&");
        }
        // 코드블럭이 한줄이면 생략 가능
        switch (a) {
            case 1, 2 -> {
                System.out.println("code$");
            }
            case 3, 4 -> {
                System.out.println("code^");
            }
            case 5, 6 -> {
                System.out.println("code&");
            }
        }
    }
}
