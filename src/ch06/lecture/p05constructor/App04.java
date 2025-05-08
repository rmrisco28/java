package ch06.lecture.p05constructor;

public class App04 {
}

class MyClass41 {
    String name;
    String address;
    int age;
    boolean married;
    // 쉽게 생성자 만드는 방법

    public MyClass41(String name, String address, int age, boolean married) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.married = married;
    }
}

class MyClass42 {
    String color;
    int age;
    String name;
    boolean yesOrNo;
    double sosu;

    public MyClass42(String color, int age, String name, boolean yesOrNo, double sosu) {
        this.color = color;
        this.age = age;
        this.name = name;
        this.yesOrNo = yesOrNo;
        this.sosu = sosu;
    }
}
