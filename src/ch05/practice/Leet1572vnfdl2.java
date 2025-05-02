package ch05.practice;

public class Leet1572vnfdl2 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        // 각 행에서 두개 씩 더하는 방법
        
        int red = 0;
        int blue = mat.length - 1;


        for (int i = 0; i < mat.length; i++) {
            sum += mat[red][blue];
            red++;
            blue--;

        }
        if (mat.length % 2 == 1) {
            int d = mat.length / 2;
            sum -= mat[d][d];
        }

    }
}
