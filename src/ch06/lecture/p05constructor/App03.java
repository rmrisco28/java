package ch06.lecture.p05constructor;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03("머스크", 66, "texas");

        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.address);

        MyClass03 b = new MyClass03("도날드", 77, "ny");
        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(b.address);
    }
}

class MyClass03 {
    // 필드
    String name;
    int age;
    String address;

    // 생성자
    MyClass03(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 메소드
    // 클래스 작성 순서는 상관없으나
    //관습적으로는 필드 생성자 메소드 순
}
