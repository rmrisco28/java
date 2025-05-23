package ch14.lecture;

public class App06 {
    public static void main(String[] args) throws InterruptedException {
        // Thread 사용 시 주의 해야하는 점
        // : 여러 쓰레드는 공유하는 객체의 상태를 변경할 때 조심해야 함
        // 원하는 결과가 나오지 않을 수 있음.

        Box10 box = new Box10();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increse();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increse();
            }
        });
        thread2.start();
        thread1.join();
        thread2.join();

        // 메인 클래스는 종료 한 뒤에 계산 할 것이기 때문에
        // 위 thread1,2 에 join 추가
        int value = box.getValue();
        System.out.println("value = " + value);
    }
}

class Box06 {
    private int value;

    public int getValue() {
        return value;
    }

    public void increse() {
        value++;
    }
}
