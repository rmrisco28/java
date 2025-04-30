package ch04.exercise;

public class exercise03 {
    public static void main(String[] args) {
        int i = 1;
        int a = 0;
        while (i <= 100) {
            if (i % 3 == 0) {
                a += i;
                System.out.println(a + "+" + i + "=" + (a + i));

            }
            i++;
        }
        System.out.println(a);
    }
}
