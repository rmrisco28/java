package ch05.practice;

public class Leet1572 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int a = 0;
        int b = 0;
        int x = 0;
        for (int i = 0; i < mat.length; i++, x++) {
            a += mat[i][x];
        }
        System.out.println("-------------");
        int y = 0;
        for (int i = mat.length - 1; i >= 0; i--, y++) {
            if (i == y) {
                continue;
            }
            b += mat[i][y];
        }
        System.out.println(mat.length);
        System.out.println(a);
        System.out.println(b);

    }
}
