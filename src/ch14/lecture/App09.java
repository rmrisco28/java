package ch14.lecture;

public class App09 {
    public static void main(String[] args) throws InterruptedException {

        Box10 box = new Box10();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increse();
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increse();
            }
        });
        t2.start();

        t1.join();
        t2.join();

        int value = box.getValue();
        System.out.println("value = " + value);

    }
}

class Box09 {
    private int value;

    public int getValue() {
        return value;
    }

    // 어차피 메소드 자체가 싱크로나이즈드 메소드가 된다면
    // synchronized method
    // : lock (:this)을 획득한 스레드만 실행 가능
    public synchronized void increse() {
        value++;


    }
}