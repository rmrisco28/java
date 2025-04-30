package ch04.lecture;

public class C12while {
    public static void main(String[] args) {
        // while
        // (소괄호) 안의 조건이 true면 코드블럭 실행
        // 이후 다시 조건 확인을 이어감

        System.out.println("code1");
        int i = 0;
        while (i < 5) {
            System.out.println("code2");
            System.out.println("code3");

            i++;
        }
        System.out.println("code4");

        System.out.println("code5");

    }
}
