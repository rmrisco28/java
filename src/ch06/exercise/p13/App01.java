package ch06.exercise.p13;

public class App01 {
    public static void main(String[] args) {
        Member m1 = new Member();
//        m1.name = "도날드";
//        m1.age = 99;

        m1.setName("도날드");
        System.out.println("m1.getName() = " + m1.getName());
        m1.setAge(99);
        System.out.println("m1.getAge() = " + m1.getAge());

        Member m2 = new Member();
//        m2.name = "트럼프";
//        m2.age = 888;
        m2.setName("트럼프");
        System.out.println("m2.getName() = " + m2.getName());
        m2.setAge(48);
        System.out.println("m2.getAge() = " + m2.getAge());

    }
}
