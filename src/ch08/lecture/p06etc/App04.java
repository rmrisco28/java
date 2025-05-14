package ch08.lecture.p06etc;

public class App04 {
    public static void main(String[] args) {

        MyClass041 a = new MyClass041();
//        a.common();
        a.action();
        a.action2();
    }
}

interface MyInterface04 {
    default void action() {
        System.out.println("MyInterface04.action");
        common();
    }

    default void action2() {
        System.out.println("MyInterface04.action2");
        common();
    }

    // 어떤 코드의 일부분으로만 실행이 되야하는데, 어디서든 접근이 가능해져버림.
    // 해당 인터페이스에서만 접근 가능하도록
    // private 인스턴스 메소드를 만들자
    private void common() {
        System.out.println("공통된 매우 긴 코드");

    }
}

class MyClass041 implements MyInterface04 {
}

class MyClass042 implements MyInterface04 {
}
