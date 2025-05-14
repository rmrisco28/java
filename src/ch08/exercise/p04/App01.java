package ch08.exercise.p04;

public class App01 {
    public static void main(String[] args) {
        A a = new B();

        a = new C();
        a = new D();
        a.method(new B());
        a.method(new C());
        a.method(new D());
    }
}
