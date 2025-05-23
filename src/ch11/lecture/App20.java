package ch11.lecture;

public class App20 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (AngryException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws AngryException {
        throw new AngryException("직접 메시지 작성");
    }

}

// 필요해서 직접 만든 Exception(checked exception)
class AngryException extends Exception {
    public AngryException() {
//        super("기본메시지"); // 써도되고 안써도 되고
    }

    public AngryException(String message) {
        super(message);
    }
}
