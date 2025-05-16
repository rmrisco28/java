package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App03 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9_]", "f")); // 영 대소문자, 숫자, 언더스코어
        // \w: [a-zA-Z0-9]
        // 자바에서 "따옴표" 안의 \ 는 \\로 사용해야함
        System.out.println(Pattern.matches("\\w", "q")); //영대소문자, 숫자 언더스코어
        System.out.println(Pattern.matches("\\w\\w", "qq")); //영대소문자, 숫자 언더스코어
        System.out.println(Pattern.matches("\\w\\w\\w", "qqqq")); //영대소문자, 숫자 언더스페이스
        System.out.println(Pattern.matches("\\w\\w\\w", "qq"));// false //영대소문자, 숫자 언더스페이스


    }
}
