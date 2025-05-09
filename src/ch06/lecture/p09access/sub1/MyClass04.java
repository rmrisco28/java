package ch06.lecture.p09access.sub1;

public class MyClass04 {
    private int age;
    public String eamil;

    // package private
    String home;

    void method() {
        System.out.println("age = " + age);
        System.out.println("eamil = " + eamil);
        System.out.println("home = " + home);

    }
}
