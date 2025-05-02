package ch05.practice;

public class p02 {
    public static void main(String[] args) {
        // 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
        int[][] mathScores = new int[2][3];

        // 배열 항목 값 변경
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        // 전체 학생의 수학 평균 구학
        int mathSum = 0;
        int mathStudent = 0;
        for (int i = 0; i < mathScores.length; i++) {
            mathStudent += mathScores[i].length;
            for (int j = 0; j < mathScores[i].length; j++) {
                mathSum += mathScores[i][j];
            }
        }
        int mathAvg = mathSum / mathStudent;

        System.out.println(mathStudent);
        System.out.println("전체 학생의 수학 평균 점수: " + mathAvg);
        System.out.println();


        // 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        // 배열 항목값 변경
        englishScores[0][0] = 80;
        englishScores[0][1] = 83;
        englishScores[1][0] = 86;
        englishScores[1][1] = 90;
        englishScores[1][2] = 92;
        
        //전체 학생 영어 평균 구하기

    }
}


