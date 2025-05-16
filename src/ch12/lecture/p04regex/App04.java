package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App04 {
    public static void main(String[] args) {
        // {n,m} " n개에서 m개 사이 수량

        // 영문 대소문자, 숫자, 언더스코어가 2개에서 4개
        System.out.println(Pattern.matches("\\w{2,4}", "1_")); //true
        System.out.println(Pattern.matches("\\w{2,4}", "9a2")); //true
        System.out.println(Pattern.matches("\\w{2,4}", "fds2")); //true
        System.out.println(Pattern.matches("\\w{2,4}", "1")); // false
        System.out.println(Pattern.matches("\\w{2,4}", "1vc5w")); // false

        // {n} : 정확히 n개
        // {n,} : n개 이상
        System.out.println(Pattern.matches("\\w{2}", "ae"));
        System.out.println(Pattern.matches("[가-힣]{3,}", "손흥민"));
        System.out.println(Pattern.matches("[가-힣]{3,}", "일론머스크"));
        System.out.println(Pattern.matches("[가-힣]{3,}", "일론 머스크")); // false 띄어쓰기 없어서
        System.out.println(Pattern.matches("[가-힣 ]{3,}", "일론 머스크")); // true

    }
}
