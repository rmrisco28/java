package ch06.lecture.p06static;

public class App03 {

}

class MyClass03 {
    static String address;
    static int height;

    int age;
    String name;

    static void work() {
        System.out.println(address + ", " + height);
        greeting();
    }

    static void greeting() {
        
    }

    static void staticMethod() {
        // 클래스메소드(멤버)에서 인스턴스 멤버 접근 불가능
//        go(); // x
//        System.out.println(name); // x
        // 왜 안되냐?
        // 상식적으로 instance는
    }

    void instanceMehod() {
        // 인스턴스 메소드 (멤버)에서 클래스멤버 접근 가능
        greeting();
        System.out.println(address); // ok
    }


    void action() {
        System.out.println(this.name + "은" + this.age + "세다");
        this.go();
    }

    void go() {

    }

}
