package ch04.lecture;

public class C13while {
    public static void main(String[] args) {
        //변수 scope: 선언된 {} 내에서만 사용 가능

        boolean b = true;
        int a = 3;
        while (b) {
            a = 3;
            System.out.println(a);
        }
        System.out.println(a);
        // while문 안에서 선언했기 때문에 불가능
    }
}
