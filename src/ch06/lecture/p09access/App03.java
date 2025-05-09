package ch06.lecture.p09access;

import ch06.lecture.p09access.sub1.MyClass04;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
//        a.age = 33; // 불가능
        a.name = "java";
        a.address = "seoul";
    }
}

class MyClass03 {
    private int age;
    public String name;
    String address;

    void action() {
        System.out.println("age = " + age);
        System.out.println("name = " + name);
    }
}
