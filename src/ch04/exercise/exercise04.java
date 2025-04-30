package ch04.exercise;

public class exercise04 {
    public static void main(String[] args) {
        int a;
        int b;
        int c = 0;
        do {
            a = (int) (Math.random() * 6 + 1);
            b = (int) (Math.random() * 6 + 1);
            c = a + b;
            System.out.println(a + "+" + b);
        } while (c != 5);
        System.out.println("종료됩니다.");


/*        int a;
        int b;
        int c = 0;
        while (c != 5) {
            a = (int) (Math.random() * 6 + 1);
            b = (int) (Math.random() * 6 + 1);
            c = a + b;
            System.out.println(a + "+" + b);
        }
        System.out.println("종료됩니다.");*/


    }


}
