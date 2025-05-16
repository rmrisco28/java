package ch12.lecture.p05wrapper;

public class App03 {
    public static void main(String[] args) {
        int a = 3;
        Integer b = a; // boxing

        // object의 상속관계라 가능
        Object c = b;

        Object d = 3;

        int e = b; // unboxing

//        int f = d; // x 자동 형변환 일어난 것 까지는 불가


    }
}
