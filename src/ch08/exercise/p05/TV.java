package ch08.exercise.p05;

public class TV implements Remocon {
    // 메소드 재정의
    

    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다.");
    }

    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }
}
