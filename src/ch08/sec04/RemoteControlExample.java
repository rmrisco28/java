package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5455);
        rc.turnOff();


        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5455);
        rc.turnOff();
    }
}
