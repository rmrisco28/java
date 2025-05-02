package ch05.practice;

import java.util.Arrays;

public class leet566 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2},
                {3, 4}
        };
        int r = 1;
        int c = 4;
        int x = 0;
        int y = 0;

        int[][] a = new int[r][c];
        if (mat.length * mat[0].length == r * c) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++, y++) {
                    a[x][y] = mat[i][j];
                    System.out.print(a[x][y]);
                }
                System.out.println();
            }
        } else {
            a = mat;
        }
        String a1 = Arrays.toString(mat[0]);
        String a2 = Arrays.toString(mat[1]);
        System.out.println(a1);
        System.out.println(a2);
    }

}
