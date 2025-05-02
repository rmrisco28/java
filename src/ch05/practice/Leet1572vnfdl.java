package ch05.practice;

public class Leet1572vnfdl {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                } else if ((i + j) == mat.length - 1) {
                    sum += mat[i][j];
                }
            }

        }
        System.out.println(sum);
    }
}
