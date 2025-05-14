package ch07.lecture.p08protected.sub2;

import ch07.lecture.p08protected.sub1.MyClass01;

public class Child01 extends MyClass01 {
    public void action2() {
//        method4(); // private 안됨.
//        method3(); // pacakge private 같은 패키지가 아니기 때문에
        method2(); // 다른 패키지에 있어도 상속 받으면 접근 가능
        method1();
    }
}
