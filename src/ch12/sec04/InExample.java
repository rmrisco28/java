package ch12.sec04;

public class InExample {
    public static void main(String[] args) throws Exception {
        int speed = 0;
        int keyCode = 0;
        while (true) {
            // Enter키를 읽지 않았을 경우에만 실행
            if (keyCode != 13 && keyCode != 10) {
                if (keyCode == 49) { // 숫자 1키를 읽었을 경우
                    speed++;
                } else if (keyCode == 50) {
                    speed--;
                } else if (keyCode == 51) {
                    break;
                }
                System.out.println("--------------------------");
                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
                System.out.println("--------------------------");
                System.out.println("현재 속도= " + speed);
                System.out.print("선택: ");

            }
            // 키를 하나씩 읽음
            // read 키보드로부터 입력을 받는구나 라고 생각하면됨.
            // 18장에 나오니 나중에.
            keyCode = System.in.read();
            
        }
        System.out.println("프로그램 종료");
    }
}
