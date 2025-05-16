package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App02 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("a", "a"));
        System.out.println(Pattern.matches("a", "b"));

        // 한글자 위치에 a도 오고 b도 오게 하는 방법
        // [] : character class
        // 대괄호 안에 나열된 문자들이 나오면 true
        System.out.println(Pattern.matches("[ab]", "a")); // true
        System.out.println(Pattern.matches("[ab]", "b")); // true
        System.out.println(Pattern.matches("[ab]", "ab")); // false
        System.out.println(Pattern.matches("[ab][ab]", "ab")); // true
        System.out.println(Pattern.matches("[ab][ab]", "aa")); // true
        System.out.println(Pattern.matches("[ab][ab]", "ba")); // true
        System.out.println(Pattern.matches("[ab][ab]", "bb")); // true

        // [대괄호] 안의 - : 범위
        System.out.println(Pattern.matches("[a-e]", "a")); //true
        System.out.println(Pattern.matches("[a-e]", "d")); //true
        System.out.println(Pattern.matches("[a-e]", "b")); //true
        System.out.println(Pattern.matches("[a-e]", "e")); //true
        System.out.println(Pattern.matches("[a-e]", "f")); // false
        System.out.println(Pattern.matches("[a-e]", "c")); //true

        System.out.println(Pattern.matches("[a-z]", "o")); // 소문자 한글자 true
        System.out.println(Pattern.matches("[A-Z]", "G")); // 대문자 한글자 true
        System.out.println(Pattern.matches("[A-Z]", "g")); // 대문자 한글자 false
        System.out.println(Pattern.matches("[0-9]", "3"));
        System.out.println(Pattern.matches("[0-9A-Za-z]", "z"));// 대소문자, 숫자 true
        System.out.println(Pattern.matches("[가-힣]", "손")); // true


    }
}
