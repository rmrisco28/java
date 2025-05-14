package ch09.lecture.p01nested;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        MyClass01.SubClass01 b = a.new SubClass01();
    }
}

class MyClass01 {
    // 클래스
    class SubClass01 {
        // 여기 만들어지면 주로 상위 클래스 안에서 쓰인다.
        // 왜 여기다 만드냐면, 굳이 밖에 만들 필요가 없어서.
    }

    // 필드
    SubClass01 a = new SubClass01();

    // 생성자
    MyClass01() {
        a = new SubClass01();
    }
    // 메소드

}
