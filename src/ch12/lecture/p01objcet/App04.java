package ch12.lecture.p01objcet;

public class App04 {
    public static void main(String[] args) {
        String a = new String("jav");
        String b = new String("jav");

        // 참조값이 같은가?
        System.out.println(a == b);
        //내용물이 가은가?
        // 동일한 문자 나열만 확인을 함.
        System.out.println(a.equals(b));
    }
}
