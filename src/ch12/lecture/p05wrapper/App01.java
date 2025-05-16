package ch12.lecture.p05wrapper;

public class App01 {
    public static void main(String[] args) {
        // 예전에, 타입은 두개 있다.
        // 기본타입 8개
        // byte, short, int, long
        // float, double
        // boolean
        // char

        // 참조타입 8개 (Wrapper Class), 13장 15장 사용
        // Byte, Short, Integer ,Long
        // Float, Double
        // Boolean
        // Character

        //int 타입을 그냥 써도 되지만 어떤 이유에서 참조 타입으로 바꿔야하는 때가 있음.
        //13장 15장
        int a = 3;

        // 참조타입 Integer로 기본타입 int를 감싼 객체
        Integer b = Integer.valueOf(a); // boxing
//        Integer c = new Integer(a); // 9버전 이전에만 가능, 현재는 사용 x

        Integer c = a; // auto boxing 현재는 이렇게 사용

        Integer d = 99999; // auto boxing

        // 참조 타입 Integer를 기본타입 int로 전환
        int e = d.intValue(); // unboxing

        int f = d; //auto unboxing


    }
}
