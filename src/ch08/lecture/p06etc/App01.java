package ch08.lecture.p06etc;

public class App01 {
    public static void main(String[] args) {
        System.out.println(MyInterface01.AGE);
        System.out.println(MyInterface01.HOME_ADDRESS);
    }
}

interface MyInterface01 {
    // public static final 필드
    // 적지 않아도 자동으로 생성됨 public static final
    // final 이기 때문에, 값을 바로 줘야하고, 대문자로 써야함

    int AGE = 1;
    String HOME_ADDRESS = "seoul";

    // 추상 메소드
}

