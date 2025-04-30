package ch04.lecture;

public class C05Random {
    public static void main(String[] args) {
//        0.0 <= Math.random() <1.0
        // 0.0은 나오고 1.0은 안나온다.

        //double 값 리턴
        double a = Math.random();
        // 0.0 <= a <1.0
        System.out.println("a = " + a);
        // 예제) 주사위 1,2,3,4,5,6 중에 임의의 한개 값이 나오게 해야한다면?
        // a에 6을 곱하면

//        0.0 <= a*6 <1.0
        a *= 6;
        System.out.println("a = " + a);

        // 소수점을 버리면 0~5 가 나옴
        int b = (int) a;
        System.out.println("b = " + b);

        b += 1;
        System.out.println("b = " + b);

        // 위 코드를 한줄에 쓰면
        int c = (int) (Math.random() * 6) + 1;
        System.out.println("c = " + c);

        // 책 p199
        // 20을 곱해서, 0부터 19까지의 임의의 수가 계산되고 81을 더하면
        // 81부터 100의 값을 계산하는 코드
        int score = (int) (Math.random() * 20) + 81;

    }
}
