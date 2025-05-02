package ch05.practice;

public class leet867 {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int[][] a = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                a[i][j] = matrix[j][i];
                System.out.println(i + "," + j);

            }

        }
        // 결과 출력
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }


    }
}
