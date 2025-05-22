package practice.d250522_stream01;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App01 {
    public static void main(String[] args) {

/* 1번 문제
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        list.stream()
                .filter(s -> s % 2 == 0)
                .map(s -> s * s)
                .forEach(System.out::println);
*/

/*
        // 2번 문제
        List<String> list = List.of("java", "spring", "html", "css", "sql");

        Integer reduce = list.stream()
                .map(s -> s.length())
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
*/

/*        // 3번 문제
        List<String> list = List.of("java", "spring", "html", "css", "sql", "react");

        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(
                        s -> s.length() % 2 == 0 ? "짝" : "홀",
                        Collectors.counting()
                ));

        System.out.println("collect = " + collect);*/

        // 4번 문제
        List<String> list = List.of("java", "springboot", "html", "css", "javascript");

        Optional<String> max = list.stream()
                .max((a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println(max);

    }
}
