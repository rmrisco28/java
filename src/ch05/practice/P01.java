package ch05.practice;

public class P01 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[a]" + "[" + numbers[i] + "]");
        }

        int[] scores = {70, 85, 90, 100};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println(sum);

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        int[] b = {1, 3, 5, 7, 9};
        for (int i = 0; i < b.length; i++) {
            if (b[i] > 5) {
                System.out.println(b[i]);
            }
        }
        int[] c = {80, 90, 100};
        int total = 0;
        int avr = 0;
        for (int i = 0; i < c.length; i++) {
            total += c[i];
        }
        avr = total / c.length;
        System.out.println(total);
        System.out.println(avr);
    }
}
