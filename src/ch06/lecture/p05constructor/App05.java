package ch06.lecture.p05constructor;

public class App05 {
}

class Myclass05 {
    String name;
    String email;
    int age;
    boolean done;

    // 초기화 하지 않으면 기본값을 넣고 싶을 때 if 이런거 굳이 안쓰고,
    // 생성자는 여러 개 만들 수 있음.
    // 여러 생성자는 파라미터 갯수, 타입, 순서가 달라야함.
    public Myclass05(String name, String email, int age, boolean done) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.done = done;
    }

    public Myclass05(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // 파라미터 이름과는 관계없이, 타입, 갯수에 따라 생성 여부가 결정된다.
/*    public Myclass05(String name) {
        this.name = name;
    }

    public Myclass05(String email) {
        this.email = email;
    }*/
}
