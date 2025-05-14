package ch12.lecture.p01objcet;

import java.util.Objects;

public class App06 {
    public static void main(String[] args) {
        Student06 a = new Student06(1, "son");
        Student06 b = new Student06(2, "son");
        Student06 c = new Student06(3, "kim");
        Student06 d = new Student06(1, "son");
        int ah = a.hashCode();
        System.out.println("ah = " + ah);
        System.out.println("b.hashCode() = " + b.hashCode());
        System.out.println("c.hashCode() = " + c.hashCode());
        System.out.println("d.hashCode() = " + d.hashCode());

    }
}


class Student06 {
    private int CalssNumber;
    private String name;

    public Student06(int calssNumber, String name) {
        CalssNumber = calssNumber;
        this.name = name;
    }
    // 자주 일어나는일.이기 때문에, 인텔리제이를 쓰자.
    // 최종 목적은 equals 하는것이기 때문에 둘다 동시에 해야한다.
    // hashCode

    // 필드 기준으로 hashcode가 만들어졌구나 라고 이해하고 넘어가기
    // 이해하려하지마세요.
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student06 student06 = (Student06) object;
        return CalssNumber == student06.CalssNumber && Objects.equals(name, student06.name);
    }

    // equals
    @Override
    public int hashCode() {
        return Objects.hash(CalssNumber, name);
    }


}