package leetCode.p118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        // 특정 행을 만들때 이전 행이 필요함.
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for (int j = 1; j < numRows; j++) {

            List<Integer> prev = result.getLast(); // 이전 행
            List<Integer> row = new ArrayList<>(); // 특정행
            result.add(row); // 위에든 아래든 어디에 둬도 상관없음.
            row.add(1);

            // 중간의 값들
            for (int i = 0; i < prev.size() - 1; i++) {
                int n1 = prev.get(i);
                int n2 = prev.get(i + 1);
                row.add(n1 + n2);
            }


            row.add(1);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generate(5);
        System.out.println();
    }
}



