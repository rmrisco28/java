package ch17.exercise.p05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "this is a java book",
                "Lambd Expressions",
                "Java8 supports lambd expressions"
        );
        // 선언형

        list.stream()
                .filter(a -> a.toLowerCase().contains("java".toLowerCase()))
                .forEach(System.out::println);

/*        // 명령형으로 한다면
        for (String item : list) {
            String lowerCase = item.toLowerCase();
            if (lowerCase.contains("java")) {
                System.out.println(item);
            }
        }*/
    }
}
