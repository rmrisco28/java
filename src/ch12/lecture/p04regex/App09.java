package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App09 {
    public static void main(String[] args) {
        // |: or


        //ab 거나 12거나 일 경우 참
        System.out.println(Pattern.matches("(ab|12)", "ab")); // true
        System.out.println(Pattern.matches("(ab|12)", "12")); // true

        System.out.println(Pattern.matches("(ab|12)+", "12ab")); // true
        System.out.println(Pattern.matches("(ab|12)+", "12abab")); // true


    }
}
