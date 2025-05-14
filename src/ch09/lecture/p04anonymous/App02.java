package ch09.lecture.p04anonymous;

public class App02 {
    public static void main(String[] args) {
        MyInterface02 a = new MyClass02();
        a.action();

        // 인터페이스 인스턴스 생성방법
        MyInterface02 b = new MyInterface02() {
            @Override
            public void action() {
                System.out.println("App02.action");
            }
        };
        b.action();
    }
}

interface MyInterface02 {
    void action();
}

// 원래 알고 있는 방법
class MyClass02 implements MyInterface02 {
    @Override
    public void action() {
        System.out.println("MyClass02.action");
    }
}
