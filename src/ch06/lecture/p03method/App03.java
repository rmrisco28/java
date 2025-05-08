package ch06.lecture.p03method;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        a.action2();
        //action3메소드에서 반환된 345 값
        double b = a.action3();
        System.out.println("다음 코드들...");
        System.out.println("b = " + b);
        String s = a.action4();
        System.out.println("s = " + s);
        System.out.println("a.action4() = " + a.action4());
        int c = a.action5();
        System.out.println("c = " + c);

    }
}

class MyClass03 {
    void action() {
        // 코드...

        // return
        // 1. 메소드 종료
        // 2. 오른쪽 값 호출 한 곳으로 반환
    }

    void action2() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        if (true) {
            return;  // 메소드 종료
        }
        System.out.println(4);
    }

    // 메소드 앞에 있는
    // 리턴 타입과
    // return문의 오른쪽 값 타입이 일치해야함.
    double action3() {
        System.out.println(99);
        System.out.println(88);
        return 3.14;
    }

    String action4() {
        return "hello";
    }

    int action5() {
        // 리턴 타입을 명시하면 꼭 타입에 맞는 값을 리턴해야함.
        return 5;
    }

    int action7() {
        // 리턴할 값이 없다면 void 리턴 타입 사용
        return 3;
    }

    // 리턴문을 못만나서 에러남.
/*    int action8() {
        // 리턴문을 만나도록 코드를 작성해야함
        if (true) {
            return 10;
        }
    } */
}
