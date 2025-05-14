package ch09.lecture.p04anonymous;

public class App01 {
    public static void main(String[] args) {
        MyClass011 a = new MyClass011();
        a.action1();
        a.action2();


        // 익명 클래스의 객체
        MyClass01 b = new MyClass01() {
            // 추상클래스 상속받은 클래스의 몸통과 같은 일을 한다.
            // -> 추상 메소드를 정의한다.
            @Override
            void action1() {
                System.out.println("App01.action1");
            }

            @Override
            void action2() {
                System.out.println("App01.action2");
            }
        };
        b.action1();
        b.action2();

    }
}

// 추상 클래스
abstract class MyClass01 {
    abstract void action1();

    abstract void action2();
}

//위는 추상 클래스니, 인스턴스를 만들 수 없음.
class MyClass011 extends MyClass01 {
    @Override
    void action1() {
        System.out.println("MyClass011.aciton1");
    }

    @Override
    void action2() {
        System.out.println("MyClass011.aciton2");
    }
}
