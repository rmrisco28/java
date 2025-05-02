package ch05.practice;

import java.util.Arrays;

public class c01 {
    public static void main(String[] args) {
        int[] gain = {1, 2, 3, 4};

        int[] a = new int[gain.length + 1];
        int[] b = new int[a.length];
        int[] c = new int[b.length];
        b[0] = 0;
        c[0] = 0;

        for (int i = 0; i < gain.length; i++) {
            b[i + 1] = gain[i];
        }
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i - 1] + b[i];
        }
        Arrays.sort(c);

        System.out.println(c[c.length - 1]);
    }
}
