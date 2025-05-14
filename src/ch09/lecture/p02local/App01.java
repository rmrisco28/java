package ch09.lecture.p02local;

public class App01 {
    // 메소드
    void someMethod() {
        // 메소드 안에서 클래스 작성 가능
        // local class 작성
        class SomeClass {
            // 필드
            // 생성자
            // 메소드
        }
        // 메소드 안에서만 활용되는 클래스
        SomeClass a = new SomeClass();
        SomeClass b = new SomeClass();

    }

    void action() {
//        SomeClass a = new SomeClass();
    }
}
