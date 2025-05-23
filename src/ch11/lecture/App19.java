package ch11.lecture;

public class App19 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void method1() {
        throw new HungryException();
    }


}

// 직접 필요한 Exception 만들어 사용할 수 있다.
class HungryException extends RuntimeException {
    HungryException() {
        super("그냥 배고파");
    }

    HungryException(String message) {
        super(message);
    }
}
