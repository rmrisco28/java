package ch04.lecture;

public class C23break {
    public static void main(String[] args) {
        // break: 가장 가까운 반복문(for, while, siwtch) 종료

        // label 과 함께 사용하면 label이 붙은 반복문(for while) 종료

        loop1:
        //labal
        for (int x = 1; x <= 10; x++) {
            loop2:
            for (int y = 1; y <= 10; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.println(x + "," + y);
                    break loop1;
                }
            }
        }
    }
}
