package ch07.lecture.p03polymorphism;

public class App03 {
    public static void main(String[] args) {
        Dog01 a = new Dog01();
        BullDog01 b = new BullDog01();
        Chihuahua01 c = new Chihuahua01();
        a.bark(); // 멍멍
        b.bark(); // 으르렁
        c.bark(); // 깨갱

        // 자동형변환이 일어나면 어떻게 되냐
        Dog01 d = b;
        d.bark(); // 멍멍이냐 으르렁이냐
        // 실제 인스턴스의 메소드가 실행. *중요!*
        // 타입은 그 객체의 타입만 결정될 뿐, 실행되는메소드와는 관계없음.

        Dog01 e = c;
        e.bark(); // 깨갱5

    }
}

class Dog01 {
    // 짖다라는 메소드
    public void bark() {
        System.out.println("멍멍");
    }
}

class BullDog01 extends Dog01 {
    @Override
    public void bark() {
        System.out.println("으르렁");
    }
}

class Chihuahua01 extends Dog01 {
    @Override
    public void bark() {
        System.out.println("깨갱");
    }
}