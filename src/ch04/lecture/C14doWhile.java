package ch04.lecture;

public class C14doWhile {
    public static void main(String[] args) {
        // while : () 조건 확인 후 {} 실행 -> ()조건 확인
        // do while: {코드블럭} 실행 -true -> {코드블럭} 실행

        System.out.println("code1");

        boolean a = false;
        do {
            System.out.println("code2");
            System.out.println("code3");
        } while (a);

        System.out.println("code4");
        System.out.println("code5");
    }
}
