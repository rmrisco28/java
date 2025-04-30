package ch03.lecture;

public class C13Assignment {
    public static void main(String[] args) {
        // 대입 연산자 (할당 연산자, assignment)
        // 오른쪽의 값을 왼쪽에 넣는다.
        int a;
        a = 3;
        System.out.println("a = " + a);
        System.out.println("(a = 5) = " + (a = 5));

        int b;
        b = a = 7;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // 산술연산자는 왼쪽부터 연산하지만,
        // 대입 연산자는 오른쪽부터 연산한다.

        // +=, -=, *=, /=, %/
        // 두 피연산자의 산술 연산 후 왼쪽 변수에 결과 대입

        int c = 5;
        c += 7; // c = c + 7;
        System.out.println("c = " + c);

        c -= 9; // c = c - 9;
        System.out.println("c = " + c);

        c *= 8; // c = c * 8;
        System.out.println("c = " + c);

        c /= 2; // c = c / 2;
        System.out.println("c = " + c);

        c %= 5; // c= c % 5;
        System.out.println("c = " + c);

        double x = 5.0;
        double y = 0.0;
        double z = x % y;
        if (Double.isNaN(z)) {
            System.out.println("나눌 수 없습니다.");
        } else {
            double result = z + 10;
            System.out.println("결과 " + result);
        }
    }
}
