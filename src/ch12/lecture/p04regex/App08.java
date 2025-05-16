package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App08 {
    public static void main(String[] args) {
        //(): 그룹

        // (숫자 3개 공백 하나) 가 여러개
        System.out.println(Pattern.matches("(\\d{3} )+", "861 ")); // true
        System.out.println(Pattern.matches("(\\d{3} )+", "861 861 861 ")); // true
    }
}
