package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        // 참조값이 같은지 확인
        // 좋은 습관 아님!!
        if (strVar1 == strVar2) { // true
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }
        // 문자열이 같은지 확인
        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strvar2는 문자열이 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strvar4는 문자열이 같음");
        }
    }
}
