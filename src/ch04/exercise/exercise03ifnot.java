package ch04.exercise;

public class exercise03ifnot {
    public static void main(String[] args) {
        int i = 0;
        int a = 0;
        while (i <= 100) {
            while (i % 3 == 0) {
                System.out.print(a + "+" + i);
                a += i;
                i++;
                System.out.println("=" + a);
            }
            i++;
        }
        System.out.println(a);
    }
}
