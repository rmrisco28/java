package ch04.practice;

public class make1To100 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 19) {
            int a = 1;
            while (a <= 19) {
                System.out.println(i + "x" + a + "=" + i * a);
                a++;
            }
            i++;
        }
    }
}
