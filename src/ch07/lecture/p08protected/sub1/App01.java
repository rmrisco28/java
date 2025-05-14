package ch07.lecture.p08protected.sub1;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        a.method1(); // public
        a.method2(); // protected
        a.method3(); // package private
//        a.method4(); // MyClas01의 private 메소드라 호출 불가
    }
}

