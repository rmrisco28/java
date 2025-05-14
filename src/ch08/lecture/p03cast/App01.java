package ch08.lecture.p03cast;

public class App01 {
    public static void main(String[] args) {
        MyInterface01 o = new Myclass01();
        o.action();
//        o.method(); // 사용불가 왜냐면, 타입이 MyInterface01이기 때문에
        // 꼭 사용 하고 싶을 경우
        // casting: 강제 형변환
        Myclass01 a = (Myclass01) o; // 위험한 코드
        a.method();
    }
}

interface MyInterface01 {
    // 추상메소드를 정의하면
    void action();
}

class Myclass01 implements MyInterface01 {
    // 무조건 메소드 재정의를 해야함
    @Override
    public void action() {
        System.out.println("Myclass01.action");
    }

    // 추가로 메소드를 만들 수 도 있음.
    public void method() {
        System.out.println("Myclass01.method");
    }
}
