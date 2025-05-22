package ch11.lecture;

public class App05 {
    public static void main(String[] args) {
        try {
            int[] arr = {5, 0};
            // IndexOutOfBoundsException
            // ArithmeticException
//            int r = arr[0] / arr[1]; // ArithmeticException
//            int r = arr[2] / arr[1]; // IndexOutOfBoundsException
            int r = arr[1] / arr[0];  // 정상
            System.out.println("다른 코드.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스 참조 잘못됐을 때");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌때");
        }
        System.out.println("나머지 코드들...");
    }
}
