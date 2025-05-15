package ch09.exercise.e06;

public class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("자전거가 달립니다.");
        }
    };

    void method1() {
        Vehicle locaVar = new Vehicle() {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };
        locaVar.run();
    }

    void method2(Vehicle v) {
        v.run();
    }
}
