package ch07.lecture.p05abstract;

public class App02 {
    public static void main(String[] args) {
        Canids02 a = new Chihuahua02();
        a.bark(); // 깨갱

        Canids02 b = new Wolf02();
        b.bark(); // 아우~~
    }

}

// 개과
abstract class Canids02 {
    // abstract method(추상메소드): 몸통이 없는 메소드
    public abstract void bark();
    // 어떻게 운다고 하기 애매함. 몸통이 없는 메소드
}

class Chihuahua02 extends Canids02 {
    @Override
    public void bark() {
        System.out.println("깨갱");
    }
}

class Wolf02 extends Canids02 {
    @Override
    public void bark() {
        System.out.println("아우~~~~");
    }
}
