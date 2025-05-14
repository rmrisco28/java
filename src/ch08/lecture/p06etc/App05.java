package ch08.lecture.p06etc;

public class App05 {
    public static void main(String[] args) {


    }

}

interface MyInterface05 {
    static void action1() {
        System.out.println("MyInterface05.action1");
    }

    default void action2() {
        System.out.println("MyInterface05.action2");
    }

    //public 이라 원치않는 상황이 생김
    // private 인스턴스 메소드
    private void common() {
        System.out.println("매우 긴~~~ 코드");
    }
}


