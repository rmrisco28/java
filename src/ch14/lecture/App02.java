package ch14.lecture;

import java.awt.*;

public class App02 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {

            // 윈도우 소리를 한번 내는 메소드
            Toolkit toolkit = Toolkit.getDefaultToolkit();

            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(1000); // 1초 쉬고 반복한다는 의미
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start(); // 시작하면 소리가 나는것과 텍스트가 동시에 작동

        for (int i = 0; i < 5; i++) {
            System.out.println("띠리링");

            Thread.sleep(1000);
        }
        // 위 두개를 동시에 하고 싶을 경우 위 포문을
        // 쓰레드로 감싸기.

    }
}
