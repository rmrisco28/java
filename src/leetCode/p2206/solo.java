package leetCode.p2206;

import java.util.HashMap;
import java.util.Map;

public class solo {
    public static void main(String[] args) {

        int[] nums = {3, 2, 3, 2, 2, 2};
        boolean b = true;
        // nums에 있는 요소들의 갯수 세기
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        // map을 전체 탐색해서 모두 짝수 인지
        for (Integer value : map.values()) {
            if (value % 2 == 1) {
                b = false;
            }
        }
        System.out.println(b);
    }
}
