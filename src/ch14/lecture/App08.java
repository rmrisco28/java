package ch14.lecture;

public class App08 {
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

class Box08 {
    private int value;

    public int getValue() {
        return value;
    }

    public void increse() {
        synchronized (this) {
            // 그 객체 참조를 획득하려고 노력하기 때문에 this로 작성가능
            value++;
        }
    }
}