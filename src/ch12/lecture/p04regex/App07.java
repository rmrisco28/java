package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App07 {
    public static void main(String[] args) {
        // [a-zA-Z_0-9] : \w
        // [0-9] : \d
        // [ ] : \s (공백), 탭키, 엔터키 등 포함
        // \ : \\ 역슬래시 표현할때 사용. (4번써야함?)

        // . : 모든 글자
        // \. : .이라는 뜻

        System.out.println(Pattern.matches("\\w+", "fsda8325hifsd89")); // true
        System.out.println(Pattern.matches("\\d+", "57328957322442189")); // true
        System.out.println(Pattern.matches("\\s+", "          "));
        System.out.println(Pattern.matches("\\\\", "\\"));

        // 모든글자 한개 이상
        System.out.println(Pattern.matches(".*", ""));
        System.out.println(Pattern.matches(".*", "a35d"));
        System.out.println(Pattern.matches(".*", "한글"));

        // 온점표시하고 싶을때
        System.out.println(Pattern.matches("\\.", "."));
        System.out.println(Pattern.matches("\\.\\.", ".."));

    }
}
