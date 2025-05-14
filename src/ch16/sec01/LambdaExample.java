package ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        action((int x, int y) -> {
            int result = x + y;
            System.out.println("result = " + result);
        });

        action((x, y) -> {
            int result = x - y;
            System.out.println("result = " + result);
        });

    }

    public static void action(Calculable calculabe) {
        //데이터
        int x = 10;
        int y = 4;
        // 데이터 처리
        calculabe.calculate(x, y);
    }
}
