package ch03.lecture;

public class C11Logical {
    public static void main(String[] args) {
        // 논리 연산자
        // and &&, &

        // or ||, |

        // 피연산자는 boolean
        // 연산결과는 boolean
        // 자바는 타입에 민감해서 연산결과ㅔ truthy falthy 개념 없음

        // and &&
        // : 두 피연산자가 true 일 때만 결과 true, 나머지 결과 false

        System.out.println("(true && true) = " + (true && true)); // true
        System.out.println("(true && false) = " + (true && false)); // false
        System.out.println("(false && true) = " + (false && true)); // false
        System.out.println("(false && false) = " + (false && false)); // false

        System.out.println("(true & true) = " + (true & true)); // true
        System.out.println("(true & false) = " + (true & false)); // false
        System.out.println("(false & true) = " + (false & true)); // false
        System.out.println("(false & false) = " + (false & false)); // false

//        System.out.println("(0&&true) = " + (0&&true)); // x 자바스크립트에선 됐지만 이런거 안됨
//        System.out.println("(0&true) = " + (0&true)); // x

        // or ||, |
        // 두 피 연산자가 false면 결과 false, 나머지 결과는 true

        System.out.println("(true || true) = " + (true || true)); // true
        System.out.println("(true || false) = " + (true || false)); // true
        System.out.println("(false || true) = " + (false || true)); // true
        System.out.println("(false || false) = " + (false || false)); // false

        System.out.println("(true | true) = " + (true | true)); // true
        System.out.println("(true | false) = " + (true | false)); // true
        System.out.println("(false | true) = " + (false | true)); // true
        System.out.println("(false | false) = " + (false | false)); // false

        //연습
        int x = 5;
        int y = 8;
        boolean r1 = (x > 5) && (y < 5); // false
        System.out.println("r1 = " + r1);
        boolean r2 = (x > 5) || (y < 5);// false
        System.out.println("r2 = " + r2);
    }
}
