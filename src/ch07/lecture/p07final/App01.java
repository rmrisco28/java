package ch07.lecture.p07final;

public class App01 {
}

class Parent01 {

    public void action() {
    }

    // final method : 자식 클래스에서 재정의 불가.
    final public void action2() {
    }

    public final void action3() {

    }

}

class Child011 extends Parent01 {
/*    @Override
    public void action2() {
        super.action();
    }*/

    @Override
    public void action() {
        super.action();
    }
}
