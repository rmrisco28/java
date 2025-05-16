package ch12.lecture.p05wrapper;

public class App02 {
    public static void main(String[] args) {
        // Wrapper 클래스의 참조 변수는
        // null을 저장 할 수 있고
        // equals를 비교해야 합니다.

        int a = 3;
        int b = 0;

        Integer c = 3;
        Integer d = 0;
        // 얘네는 참조타입, 객체인데 가리키고 있는 인스턴스가 없다는 null 대입 가능
        Integer e = null; // 가능

        int f = 30000;
        int g = 30000;
        System.out.println(f == g);// true

        Integer h = 30000;
        Integer i = 30000;
        System.out.println(h == i); // 값이 그때그때마다 달라짐

        // 참조값의 차이를 비교할때는 .equals 사용
        System.out.println(h.equals(i)); // true

        // 참조값 찾는 hashtag
        System.out.println(System.identityHashCode(h));
        System.out.println(System.identityHashCode(i));

        Integer j = 3;
        Integer k = 3;
        System.out.println(j == k); // 값이 그때그때마다 달라짐
        System.out.println(j.equals(k)); // true
    }
}
