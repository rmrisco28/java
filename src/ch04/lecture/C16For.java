package ch04.lecture;

public class C16For {
    public static void main(String[] args) {
        // for문 종료 이후에도 사용할 때
        int i = 0;
        for (; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println("i = " + i);
    }
}
