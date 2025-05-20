package ch15.exercise.e09;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        for (String key : map.keySet()) {
            int value = map.get(key);
            if (maxScore < value) {
                maxScore = value;
                name = key;
            }

            totalScore += value;

        }

//        for (map.)

        double avg = (double) totalScore / map.size();
        System.out.println("평균 점수: " + avg);
        System.out.println("최고 점수:" + maxScore);
        System.out.println(name);

    }
}
