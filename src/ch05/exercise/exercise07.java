package ch05.exercise;

import java.util.Arrays;

public class exercise07 {
    public static void main(String[] args) {
        int[] array = {120, 1, 5, 3, 8, 2, -230, -4278};
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
        
        int max = array[0];
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);

        int min = array[0];
        for (int b : array) {
            if (b < min) {
                min = b;
            }
        }
        System.out.println(min);
    }
}
