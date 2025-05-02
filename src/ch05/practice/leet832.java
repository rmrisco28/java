package ch05.practice;

import java.util.Arrays;

public class leet832 {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] a = new int[image.length][image.length];

        for (int i = 0; i < image.length; i++) {
            int x = image.length - 1;
            for (int j = 0; j < image.length; j++, x--) {
                a[i][j] = image[i][x];
                if (a[i][j] == 1) {
                    a[i][j] = 0;
                } else {
                    a[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
