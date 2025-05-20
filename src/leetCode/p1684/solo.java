package leetCode.p1684;

import java.util.HashSet;
import java.util.Set;

public class solo {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        // allowed에 있는 각문자(Character)를 저장한 Set 만들기
        // 1. set 만들고
        // 2. allowed의 각 문자를 탐색해서
        // 3. Set에 넣고 (add)
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        int count = 0;

        // words에 있는 문자열을 전체 탐색해서 각 문자열의 문자가 allowed에 있는지 확인
        // 1. word의 각 문자열 탐색
        Set<Character> set2;

        for (int i = 0; i < words.length; i++) {
            set2 = new HashSet<>();
            for (int j = 0; j < words[i].length(); j++) {
                set2.add(words[i].charAt(j));
            }
            if (set.equals(set2)) {
                count++;
            }

            System.out.println(set2);
        }
        System.out.println(count);
        //      1. word의 각 문자(character)가
        //      2. set에 있는지 확인 contatins
        //      3. 모두다 있으면 count 늘리기

    }
}
