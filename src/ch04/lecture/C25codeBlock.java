package ch04.lecture;

public class C25codeBlock {
    public static void main(String[] args) {
        if (true) {
            // 코드블럭 {} 내의 코드들은 오른쪽 들여쓰기 해야함
            // 꼭!
        } else if (true) {
            //코드블럭내의 코드가 한줄이면
            // 중괄호 생략 가능
            // 하지만 생략하지 말 것.
            System.out.println("1");
        } else
            System.out.println("1");
        for (int i = 0; i < 3; i++)
            System.out.println("3");
        boolean a = true;
        while (a) System.out.println("2");
    }
}
