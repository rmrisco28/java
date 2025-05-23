package ch11.lecture;

public class App09 {
    public static void main(String[] args) {

        try {
            System.out.println("어떤 코드..");
            return;
        } catch (RuntimeException e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("항상 실행, try 블럭에서 메소드 종료 되었습니다.");
        }
        System.out.println("이어지는 코드들...");

        try {
            System.out.println("어떤 코드@");
        } finally {
            System.out.println("항상 실행");
        }
    }
}
