package ch05.lecture;

public class C01Array {
    public static void main(String[] args) {
        // 배열 (array): 여러 값을 담을 수 있는 자료형(data type)

        // 기본타입
        int a;
        a = 3; // 값을 하나 담을 수 있음.

        // 배열
        int[] b;
        b = new int[5]; // 여러개의 값을 담을 수 있음
        // new 연산자와 같이 사용.

        // b는 5개의 int 값을 담을 수 있음.
        b[0] = 9; // b의 0번 index에 9라는 값 대입
        b[1] = 8;
        b[2] = 7;
        b[3] = 7;
        b[4] = 1234;
//        b[5] = 12345; // 존재 하지 않는 index 사용 시 오류(exception)

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
        // b 옆에 있는 숫자 인덱스.

        // 연습
        // 3개의 int 값을 담을 수 있는 배열 c를 만들어보세요.
        int[] c;
        c = new int[3];

        // c의 각 index에 값을 담아 보세요.
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;

        // c 의 값 index 값을 출력해보세요.

        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);

        double[] d;
        d = new double[3];

        d[0] = 3.14;
        d[1] = 9.12;
        d[2] = 5.3;

        System.out.println("d[0] = " + d[0]);
        System.out.println("d[1] = " + d[1]);
        System.out.println("d[2] = " + d[2]);
        System.out.println(d); // 배열 출력시에는 에러가 발생함. //왜일까?

        //
        String[] e;
        e = new String[3];

        e[0] = "hi";
        e[1] = "hello";
        e[2] = "안녕";
        System.out.println("e[0] = " + e[0]);
        System.out.println("e[1] = " + e[1]);
        System.out.println("e[2] = " + e[2]);
    }
}
