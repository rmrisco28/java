package ch06.lecture.p03method;

public class App04 {
    public static void main(String[] args) {
        MyClass04 a = new MyClass04();
        a.action();
        a.sum(3, 5);
        a.sum(3, 4, 5);
        // 같은 이름의 메소드를 만들게 하자

    }
}

class MyClass04 {
    void action() {
        System.out.println("어떤 코드");
    }

    // method ovreloading
    // 같은 이름의 메소드 작성 가능, 언제 가능하냐?
    // 파라미터의 수, 타입, 순서가 다를 때
    void sum(int a, int b) {
        System.out.println("받은 값을 더함");
        System.out.println(a + b);
    }

    void sum(double a, int b) {
        // 타입이 달라도
    }

    void sum(int a, double b) {
        // 순서가 달라도
    }

/*    void sum(int c, double d) {
        // 파라미터 이름이 다른 것과는 관련 없음
    }*/

    void sum(double a, double b) {
        // 타입이 달라도
    }

    void sum(int a, int b, int c) {
        System.out.println("여러 값을 더함");
        System.out.println(a + b + c);
    }
}