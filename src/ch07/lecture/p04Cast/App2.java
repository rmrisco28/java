package ch07.lecture.p04Cast;

public class App2 {
    public static void main(String[] args) {
        GuideDog02 a = new GuideDog02();
        a.bark();
        a.guide();


        Dog02 b = a;
        b.bark();
//        b.guile();
        Dog02 c = new GuideDog02();
        c.bark();
//        c.guide();
    }
}

class Dog02 {
    public void bark() {
        System.out.println("멍멍");
    }
}

class GuideDog02 extends Dog02 {
    @Override
    public void bark() {
        System.out.println("왕왕");
    }

    public void guide() {
        System.out.println("길을 안내 합니다.");
    }
}

class chihuahua02 extends Dog02 {
    @Override
    public void bark() {
        System.out.println("깨갱");
    }
}

