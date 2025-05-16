package ch12.exercise.e17;

import java.util.regex.Pattern;

public class PatternMathcerExample {
    public static void main(String[] args) {
        String id = "5Angle1004";
        String regExp = "[A-Za-z]\\w{7,11}";
        Boolean isMathc = Pattern.matches(regExp, id);
        if (isMathc) {
            System.out.println("ID로 사용 할 수 있습니다.");
        } else {
            System.out.println("ID로 사용 할 수 없습니다.");
        }

    }
}
