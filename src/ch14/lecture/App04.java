package ch14.lecture;

public class App04 {
    public static void main(String[] args) throws InterruptedException {
        // join() 특정 스레드가 끝나길 기다림.
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("쓰레드 내의 코드" + i);
            }

        });
        thread.start(); // 여기부터 동시에 시작.
        thread.join(); // thread가 끝나길 기다림
        // 끝난 뒤에 메인 코드를 실행

        for (int i = 0; i < 10000; i++) {
            System.out.println("[[메인 스레드 내의 코드" + i + "]]");
        }
    }
}
