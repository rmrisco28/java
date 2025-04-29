package ch02.lecture;

public class C14Casting {
    public static void main(String[] args) {
        // 타입 변환
        // 작은 타입의 변수 값을 큰 타입에 옮겨 담는 것은 항상 가능(문제없음)


        byte a = 3; // 1byte
        short b = 100; //2bytes
        int c = 200; // 4bytes
        long d = 300L; // 8bytes

        b = a; // ok
        c = a; // ok
        d = a; // ok


        // 정수형 (byte, short, int, long)의 값을
        // 실수형 (float, double)에 옮겨 담는 것 가능 (문제없음)

        byte e = 3;
        short f = 4;
        int g = 9;
        long h = 10L;

        float i;
        double j;
        i = e; // ok
        i = f; // ok
        i = g; // ok
        i = h; // ok

        j = e; // ok
        j = f; // ok
        j = g; // ok
        j = h; // ok

        // 작은 타입에서 큰 타입으로 옮기기 가능 (문제없음)


        // char는 int 와 long에 옮기기 가능
        char m = '가';
        int n = m; // ok
        long o = m; // ok

//        short p = m; //x

    }
}
