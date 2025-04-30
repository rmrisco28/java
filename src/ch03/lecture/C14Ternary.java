package ch03.lecture;

public class C14Ternary {
    public static void main(String[] args) {
        // 삼항 연산자(ternary)
        // 조건 연산자 (conditoinal)

        // 항1 ? 항2 : 항3
        // 첫번째 결과가 true면 두번째 항 실행, false면 세번재 항 실행

        int r1 = true ? 3 : 5; // 3
        int r2 = false ? 9 : 11; // 11
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
    }
}
