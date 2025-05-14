package ch08.lecture.p06etc;

public class App03 {
    public static void main(String[] args) {
        MyInterface03.action();
    }
}

interface MyInterface03 {
    //public static final field

    // static method 추가
    // public static method
    public static void action() {
        System.out.println("MyInterface03.aciont");
    }
    // public abstract method(instance method)
    // public default method(instance method)
}
