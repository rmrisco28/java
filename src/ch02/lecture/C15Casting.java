package ch02.lecture;

public class C15Casting {
    public static void main(String[] args) {
        // 작은 타입 -> 큰 타입 (문제 없음)

        // 큰 타입 -> 작은 타입 (문제가 있을 수 있음. 매우 조심해야함)

        byte a;
        short b;
        b = 100;
        System.out.println("b = " + b); // 100

//        a = b; // 기본적으로 안됨. 강제로 해야함
        // type casting 코드
        a = (byte) b;
        System.out.println("a = " + a); // 100

        b = 128;
        a = (byte) b;
        System.out.println("a = " + a); // -128??

        // 값을 잃어 버릴 수 있다는 사실을 알고 변환해야한다
        b = 987;
        a = (byte) b;
        System.out.println("b = " + b); // 987
        System.out.println("a = " + a); // -37

        // 실수형 -> 정수형 (강제로)
        // 소수점 이하를 버릴 때 유용함.
        double c = 123.456;
        // 강제로
        int d = (int) c; // type casting

        System.out.println("c = " + c);
        System.out.println("d = " + d);


    }
}
