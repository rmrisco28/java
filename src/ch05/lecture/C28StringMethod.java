package ch05.lecture;

public class C28StringMethod {
    public static void main(String[] args) {
        // length: 문자열의 길이를 리턴
        String a = "java";
        String b = "javascript";
        String c = "hello world";
        String d = "hi spring  ";
        String f = "이순신 세종대왕 !!";

        int e = a.length();
        System.out.println("e = " + e);
        System.out.println("b.length() = " + b.length());
        System.out.println("c.length() = " + c.length());
        System.out.println("d.length() = " + d.length());
        System.out.println("f.length() = " + f.length());
    }
}
