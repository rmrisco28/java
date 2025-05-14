package ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person p = new Person();

        // 실행문이 두개 이상인경우 중괄호 사용 필수
        p.action(() -> {
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        // 실행문이 하나일 경우 중괄호 생략 가능
        p.action(() -> System.out.println("한줄"));
    }
}
