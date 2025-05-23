package ch11.lecture;

public class App10 {
    public static void main(String[] args) {
        String a = "java";
        String b = null;

        System.out.println("a.length() = " + a.length());
        if (b != null) {
            System.out.println("b.length() = " + b.length());
        }

        int c = 0;
        int d = 5;
        if (c != 0) {
            int e = d / c;
            System.out.println("e = " + e);
        }

        // Exception 이 크게 두가지로 나뉨
        // Exception (checked exception) (일반 예외)
        // try-catch 를 꼭 해야함. (다른 방법도 있음)
        // compiler가 check 함


        // RuntimeException (unchecked exception) (실행 예외)
        // try-catch 안해도 됨
        // compiler가 check 안함


    }
}
