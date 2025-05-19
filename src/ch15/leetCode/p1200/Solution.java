package ch15.leetCode.p1200;

import java.sql.Array;
import java.util.*;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> input = new ArrayList<>();
        for (int n : arr) {
            input.add(n);
        }
        List<List<Integer>> result = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        // 1. input의 정렬
        Collections.sort(input);

        // 2. 인접한 두 값의 차가 가장 적은 차이를 구해서 저장
        for (int i = 0; i < input.size() - 1; i++) {
            Integer n1 = input.get(i);
            Integer n2 = input.get(i + 1);

            int diff = n2 - n1;

            min = Math.min(min, diff);
        }

        // 3.  인접한 두 값의 차가 (2)에서 구한 값과 같으면
        for (int i = 0; i < input.size(); i++) {
            Integer n1 = input.get(i);
            Integer n2 = input.get(i + 1);
            int diff = n2 - n1;
            if (diff == min) {
                List<Integer> row = new ArrayList<>();
                row.add(n1);
                row.add(n2);
                result.add(row);
            }
        }

        //   두 값을 원소로 갖는 List를 만들어서
        // 결과 list에 추가


        return null;

    }

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 3, 6, 10, 15));


        Collections.sort(input); // 정렬
        int min = Integer.MAX_VALUE;

        // 차이 구하기 완료
        for (int i = 1; i < input.size(); i++) {
            min = Math.min(min, input.get(i) - input.get(i - 1));
        }

        for (int i = 1; i < input.size(); i++) {

            if (input.get(i) - input.get(i - 1) == min) {
                List<Integer> r1 = new ArrayList<>();
                r1.add(input.get(i - 1));
                r1.add(input.get(i));
                result.add(r1);
            }
        }

        System.out.println("현재 값" + input);
        System.out.println("차이 값" + min);
        System.out.println(result);
    }
}
