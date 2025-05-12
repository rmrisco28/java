package ch07.lecture.p02override;

public class App01 {
    public static void main(String[] args) {
        SubClass011 a = new SubClass011();
        a.action();
        a.hello();

        SubClass012 b = new SubClass012();
        b.action();
    }
}

class SubClass012 extends SuperClass01 {
    // 추가 메소드
    @Override
    public void action() {
        System.out.println("SubClass012.action");
    }
}

class SuperClass01 {

    public void action() {
        System.out.println("SuperClass01.action");
    }
}

class SubClass011 extends SuperClass01 {

    // 상속받은 메소드를 다시 정의(Override) 할 수 있음
    // @override애노테이션: override 메소드를 잘 작성했는지 검증
    // 생략해도 상관없음
    @Override
    public void action() {
        System.out.println("SubClass011.action");
    }

    public void hello() {
        System.out.println("SubClass011.hello");
    }
}
