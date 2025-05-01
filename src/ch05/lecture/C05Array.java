package ch05.lecture;

public class C05Array {
    public static void main(String[] args) {
        // 배열의 초기 값을 넣을 수 있다.
        int[] a;
        a = new int[]{5, 6, 7};

        // 선언과 동시에 초기 값을 넣을 때 new int[] 생략 가능하다.
        int[] b = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.println("b[" + i + "]" + b[i]);

        }
    }
}
