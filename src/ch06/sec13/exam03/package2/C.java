package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
    public C() {
        // 객체 생성
        A a = new A();
        // 피르값 변경
        a.field1 = 1; // public 이라 가능
//        a.field2 = 1; // 다른 패키지 안에 있어서 불가
//        a.field3 = 1; //private 라 같은 클래스 아니면 불가

        // 메소드 호출
        a.method1();
//        a.method2();
//        a.method3();
    }
}
