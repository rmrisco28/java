package ch11.lecture;

public class App07 {
    public static void main(String[] args) {
        try {
            int[] arr = {5, 0};
            int c = arr[0] / arr[2];
            System.out.println("c = " + c);
            // arithmetic인데 runtime인 이유는
            // runtime이 상위 클래스이기 때문
            // 상위 타입으로 받을 수 있다. (Excetion으로도 받을수 있다.)
            // 던질 수 있는것만 가능. object는 안됨.
            // 주로 exception까지 사용.
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("예외 처리 코드");
        }
    }
}
