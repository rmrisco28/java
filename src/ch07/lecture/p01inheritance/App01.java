package ch07.lecture.p01inheritance;

public class App01 {
    public static void main(String[] args) {
        SubClass011 a = new SubClass011();
        a.age = 3;
        System.out.println("a.age = " + a.age);
        a.action();

        SubClass012 b = new SubClass012();
        b.age = 44;
        System.out.println("b.age = " + b.age);
        a.action();
        b.address = "ny";
        System.out.println(b.address);
        b.action();
//        b.greeting();
        b.go();

        MyClass01 c = new MyClass01();
        c.age = 77;
//        c.name = "q";
//        c.address = "n";
        System.out.println("c.age = " + c.age);
        c.action();
//        c.greeting();
//        c.go();
    }
}

class MyClass01 {
    // 부모 클래스(parent class) or 상위 클래스 (super class)
    // 필드
    public int age;

    //메소드
    public void action() {

    }

}

//class MyClass02 {
//}

//상속 받는 방법 클래스명 뒤에 extends,쓰고 받고싶은 클래스명 작성

class SubClass011 extends MyClass01 {
    // 자식 클래스(child class) or 하위 클래스(sub class)
    // 하나의 자식 클래스가 여러 부모 클래스를 둘 수 없음.
    // 하나의 부모클래스가 여러 자식 클래스를 둘 수 있음

    // 멤버 추가
    // 필드
    private String name;

    // 메소드
    public void greeting() {
    }

}

class SubClass012 extends MyClass01 {
    // 자식 클래스에 추가 할 멤버
    // 필드
    public String address;

    // method
    public void go() {

    }

}

