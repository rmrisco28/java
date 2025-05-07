package ch05.lecture;

import java.util.Arrays;

public class C17Reference {
    public static void main(String[] args) {
        int[] a = {9, 3};
        int[] b = new int[a.length];
        System.out.println(Arrays.toString(a)); // 9, 3
        System.out.println(Arrays.toString(b)); // 0, 0

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(a)); // 9, 3
        System.out.println(Arrays.toString(b)); // 9, 3
        a[0] = 99;
        System.out.println(Arrays.toString(a)); // 99, 3
        System.out.println(Arrays.toString(b)); // 9, 3

        int[][] c = {{9, 2}, {5, 6}};
        int[][] d = new int[c.length][];
        System.out.println(Arrays.toString(c[0])); // 9, 2
        System.out.println(Arrays.toString(d[0])); // null(이따 설명)

        for (int i = 0; i < c.length; i++) {
            d[i] = c[i];
        }
        System.out.println(Arrays.toString(c[0])); // 9, 2
        System.out.println(Arrays.toString(d[0])); // 9, 2

        c[0][0] = 99;
        System.out.println(Arrays.toString(c[0])); // 99, 2
        System.out.println(Arrays.toString(d[0])); // 99, 2


    }

}
