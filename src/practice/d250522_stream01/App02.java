package practice.d250522_stream01;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App02 {
    public static void main(String[] args) {

/*        // 1번 문제
        List<String> list = List.of("Java", "Spring", "CSS", "HTML", "Sql");

        List<String> collect = list.stream()
                .filter(s -> s.length() >= 4)
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);*/

/*        // 2번 문제
        List<Integer> list = List.of(10, 15, 21, 30, 7);
        Integer reduce = list.stream()
                .filter(s -> s % 2 == 1)
                .reduce(0, (a, b) -> a + b);

        System.out.println(reduce);*/

/*        // 3번 문제
        List<String> list = List.of("java", "javascript", "spring", "sql", "scala", "html", "hibernate");
        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(
                        s -> s.substring(0, 1)
                        , Collectors.counting())
                );
        System.out.println(collect);*/

/*
        // 4번 문제
        List<String> list = List.of("apple", "banana", "peach", "grape", "orange");
            list.stream()
                    .max(s-> s.Strin))
*/

    }
}
