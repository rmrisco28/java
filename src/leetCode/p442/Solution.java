package leetCode.p442;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
//        List

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int a : nums) {
            if (!set.add(a)) {
                list.add(a);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 예제 입력
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        // 결과 출력
        List<Integer> result = solution.findDuplicates(nums);
        System.out.println("중복된 숫자들: " + result);
    }
}
