package ch16.lecture.p01lambda;

public class App02 {
    public static void main(String[] args) {
        // 추상 메소드가 하나 있는데,
// 위의 재정의 메소드와 아래 메소드가 동일.
// 그리고 객체가 타입도 알고.
        // lambda: functional interface (추상메소드가 하나인 인터페이스)의 익명 클래스 객체 만들때 사용
        MyInterface02 a = () -> {
            System.out.println("App02.method1");
        };

    }
}

// @FunctionalInterface : 이 인터페이스가 functional interface(추상 메소드가 하나)인지 검사

interface MyInterface02 {
    public void method1();
//    void method2();

}
