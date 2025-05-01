package ch04.lecture;

public class C17for {
    public static void main(String[] args) {

        // 무한반복
//        for (; ; ) {
//            System.out.println("반복코드");
//        }

        int i = 0;
        for (; i < 3; i++) {
            System.out.println("code..");
        }
        System.out.println("i = " + i);

        for (int j = 0; j < 3; ) {
            System.out.println("code##");
            j++;
        }
        

    }
}
