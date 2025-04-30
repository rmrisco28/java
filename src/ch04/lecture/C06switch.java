package ch04.lecture;

public class C06switch {
    public static void main(String[] args) {
        // switch: 특정 변수의 값이 같은 부분부터 실행
        int v = 20;
        switch (v) {
            case 10:
                System.out.println("코드 1");
                break;
            case 20:
                System.out.println("코드 2");
                break;
            case 30:
                System.out.println("코드 3");
                break;
            default:
                // 일치하는 case가 없을 때
                System.out.println("코드 4");
                break;
        }
    }
}
