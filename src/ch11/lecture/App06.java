package ch11.lecture;

public class App06 {
    public static void main(String[] args) {
        try {
            int[] arr = {5, 0};
            // IndexOutofBoundsException
            // ArithmeticException

            int c = arr[0] / arr[1];
            System.out.println("프로그램 진행됨");
            // 여러 예외상황이 한 exception에 들어갈 수 있다.
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("예외코드");
        }
        System.out.println("나머지 코드들");
    }
}
