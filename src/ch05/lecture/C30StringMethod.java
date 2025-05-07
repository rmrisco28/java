package ch05.lecture;

public class C30StringMethod {
    public static void main(String[] args) {
        // trim, strip: 끝의 빈 문자(white space) 삭제

        String a = "    hello world    ";
        System.out.println("a = " + a);
        String b = a.trim();
        System.out.println("b = " + b);

        String c = a.strip();
        System.out.println("c = " + c);

    }
}
