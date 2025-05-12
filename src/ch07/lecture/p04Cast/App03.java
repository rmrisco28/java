package ch07.lecture.p04Cast;

public class App03 {
    public static void main(String[] args) {
        SuperClass03 a = new SubClass031();
        a.action();
        // 꼭 슈퍼클래스에서 hello를 실행시키고 싶을 경우
        // 강제 형변환이 필요한 상황
//        a.hello();

        // 강제 형변환(위험)
        SubClass031 b = (SubClass031) a;
        b.action();
        b.hello();

    }
}

class SuperClass03 {
    public void action() {
        System.out.println("SuperClass03.action");
    }
}

class SubClass031 extends SuperClass03 {
    @Override
    public void action() {
        System.out.println("SubClass03.action");
    }

    public void hello() {
        System.out.println("SubClass03.hello");
    }
}

