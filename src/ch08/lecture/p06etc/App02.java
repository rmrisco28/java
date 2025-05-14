package ch08.lecture.p06etc;

public class App02 {
}

interface MyInterface02 {
    void action();

    // 메소드 추가 될때마다 상속받은 클래스를 바꿔줘야하니 귀찮다.
    // 몸통이 있는 메소드를 만들자.
    // default method: 인터페이스에 body가 있는 인스턴스 메소드
    default void method() {
        System.out.println("MyInterface02.method");
    }

    // 필요하면 default 메소드 재정의 가능
    // default 메소드도 항상 public
    public default void hello() {
        System.out.println("MyInterface02.hello");
    }
}

class MyClass021 implements MyInterface02 {
    @Override
    public void action() {

    }

    @Override
    public void method() {

    }
}

class MyClass022 implements MyInterface02 {
    @Override
    public void action() {

    }
}

