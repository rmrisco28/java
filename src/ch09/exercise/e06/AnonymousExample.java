package ch09.exercise.e06;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous a = new Anonymous();
        a.field.run();
        a.method1();
        a.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("트럭이 달립니다.");
            }
        });
    }
}
