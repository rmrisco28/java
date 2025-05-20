package leetCode.p119;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> prev;
        List<Integer> current = new ArrayList<>();
        current.add(1);

        for (int currentIndex = 0; currentIndex < rowIndex; currentIndex++) {
            prev = current;
            current = new ArrayList<>();
            current.add(1);
            // 이전 행의 각 값들을 더해서 넣고
            for (int i = 0; i <= prev.size() - 2; i++) {
//            current.add(prev.get(0)+prev.get(1))
                current.add(prev.get(i) + prev.get(i + 1));
            }
            current.add(1);
        }
        return current;
    }
}


class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int rowIndex = 10;  // 예시: 4번째 행
        for (int i = 0; i < rowIndex; i++) {
            List<Integer> row = solution.getRow(i);

            System.out.println("Pascal Triangle Row " + i + ": " + row);
        }

    }
}

