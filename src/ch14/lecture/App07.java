package ch14.lecture;

public class App07 {
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

class Box07 {
    private int value;
    private Object lock = new Object();

    public int getValue() {
        return value;
    }

    public void increse() {
        // synchronized block
        // : (monitor) lock을 획득한 쓰레스만 실행 가능
        // lock은 이름일뿐. 아무 변수나 들어가도 됨. // 획득하려고 노력을함.
        // JBM이 노력. 읽고 더하고 쓰고 를 한놈씩만 하게 됨.

        synchronized (lock) {
            value++;
        }
    }
}
