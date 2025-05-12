package ch07.lecture.p04Cast;

public class App01 {
    public static void main(String[] args) {
        // 인스턴스만들기
        SubClass011 a = new SubClass011();

        a.action();
        a.walk();

    }
}

class SuperClass01 {
    // 메소드
    public void action() {
        System.out.println("SuperClass01.action");
    }
}

class SubClass011 extends SuperClass01 {
    // action 메소드 갖고 있음


    @Override
    public void action() {
        System.out.println("SubClass011.action");
    }

    public void walk() {
        System.out.println("SubClass011.walk");
    }
}
