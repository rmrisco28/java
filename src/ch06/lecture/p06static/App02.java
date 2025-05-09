package ch06.lecture.p06static;

public class App02 {
    public static void main(String[] args) {
        System.out.println(MyClass02.number);
        MyClass02 a = new MyClass02();

    }
}

class MyClass02 {
    // static field
    // 스태틱 필드의 초기값은 직접 주는게 일반적
    static int number = 100;

    // static block
    static {
        // static field 초기화 코드 작성 가능
        int a = 3;
        if (true) {
            a *= 10;
        }
        number = a;
    }

    // instanc field
    int age;

    // 초기값
    MyClass02() {
        int a = 3;
        if (true) {
            a = a * 10;
        }
        this.age = 10;
    }
}
