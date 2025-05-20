package leetCode.p1684;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // allowed에 있는 각문자(Character)를 저장한 Set 만들기
        // 1. set 만들고
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        // 2. allowed의 각 문자를 탐색해서
        // 3. Set에 넣고 (add)

        // words에 있는 문자열을 전체 탐색해서 각 문자열의 문자가 allowed에 있는지 확인
        // 1. word의 각 문자열 탐색
        int count = 0;
        for (String word : words) {
            boolean checked = false;
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    checked = false;
                    break;
                }
            }
            if (checked) {
                count++;
            }
        }
        //      1. word의 각 문자(character)가
        //      2. set에 있는지 확인 contatins
        //      3. 모두다 있으면 count 늘리기

        return 0;
    }
}
