package ch06.lecture.p09access;

public class App02 {
    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        a.age = 3;
        ;
//        a.name = "java" // 불가
    }
}

class MyClass02 {
    int age;

    // 객체 내에서만 접근 가능
    private String name;

    void action() {
        System.out.println(name);
    }

}
