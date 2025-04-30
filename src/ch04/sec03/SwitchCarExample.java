package ch04.sec03;

public class SwitchCarExample {
    public static void main(String[] args) {
        char grade = 'a';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반회원입니다.");
                break;
            default:
                System.out.println("손닙입니다.");
        }
    }
}


