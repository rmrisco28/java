package ch08.sec06;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc;

        // 텔레비젼 객체 생성 후 인터페이스 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

        //디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        //audio 객체 생성 후 인터페이스 변수에 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);


        // 디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        // 정적 메소드 호출
        RemoteControl.changeBattery();
    }
}
