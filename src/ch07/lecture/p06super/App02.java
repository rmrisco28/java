package ch07.lecture.p06super;

import ch07.sec07.exam02.Parent;

public class App02 {
    public static void main(String[] args) {
        Child021 a = new Child021();
    }
}

// 생성자에 관련된 얘기
class Parent02 {
    // 필드 별일없으면 private 필드
    private String a;

    public Parent02(String b) {
        // 부모 클래스 생성자가 하는 일
        // 필드 초기화
        System.out.println("부모 클래스 필드 초기화");

    }

}

class Child021 extends Parent02 {
    public Child021() {
        // 부모 클래스의 생성자 호출 코드 꼭 있어야 함
        // 작성하지 않으면, 부모의 no-args 생성자 호출 코드 삽입됨.
        super("값");

        // 자식 클래스 생성자가 하는 일
        System.out.println("자식클래스 필드 초기화");

    }
}
