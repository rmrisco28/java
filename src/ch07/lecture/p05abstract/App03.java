package ch07.lecture.p05abstract;

public class App03 {
}

abstract class Canids03 {
    public abstract void bark();

}

class Chihuahua03 extends Canids03 {
    // 추상 메소드는 꼭 재 정의 해야함.
    @Override
    public void bark() {

    }
}

abstract class Wolf03 extends Canids03 {
    // 추상 메소드 재정의 안하면 추상클래스로 정의
}
