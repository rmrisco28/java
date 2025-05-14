package ch07.lecture.p06super;

public class App01 {

}


class Parent01 {
    public void action() {
    }

    public void action2() {
    }

    public void action3() {
        System.out.println("부모의 액션 3");
    }
}


class Child extends Parent01 {

    public void action3() {
        // 추가할 일..
        System.out.println("추가된 코드");
        super.action3();

    }

    public void action2() {
    }

    public void method() {
        this.method2();
        method2();
        // 같은 코드

        action();
        this.action();// 같은 코드

        // 재정의 한 코드들.
        action2();
        this.action2();// 같은 코드

        // 어쩔때 부모의 메소드에 접근 하고 싶을때 super 적기
        // 부모의 메소드
        super.action2();
        //super: 부모의 멤버에 젖ㅂ근하기 위한 키워드. super 메소드라고 알고있어도 됨.
    }

    public void method2() {
    }
}


