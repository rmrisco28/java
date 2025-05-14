package ch16.exercise.e07;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        // 쵀대값 얻기
        int max = maxOrMin((a, b) -> a > b ? a : b);
        System.out.println("최대값: " + max);

        int min = maxOrMin((a, b) -> a < b ? a : b);
        System.out.println("최소값: " + min);
    }
}
