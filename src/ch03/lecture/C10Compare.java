package ch03.lecture;

public class C10Compare {
    public static void main(String[] args) {
        // 같은 타입끼리 비교해야한다.

        int a = 30;
        String b = "30";
//        System.out.println("a == b = " + (a == b));

        int c = 50;
        long d = 50;
        System.out.println("c == d = " + (c == d));

        // 참조 타입 비교는 ==, != 사용하면 안됨
        // equals
        String e = "자바";
        String f = "자바";
        System.out.println("(e == f) = " + (e == f)); // true

        String g = "자";
        String h = "바";
        String i = g + h;
        System.out.println("e = " + e);
        System.out.println("i = " + i);
        System.out.println("(e) = " + (e == i));
        System.out.println("e.equals = " + e.equals(i));

    }
}
