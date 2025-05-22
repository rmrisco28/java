package practice.d250522_stream01;

import java.util.List;
import java.util.Optional;

public class App03 {
    public static void main(String[] args) {
        System.out.println("hello java");


        List<Integer> integers = List.of(1, 2, 4, 5, 7, 6, 2, 1, 2, 4, 5, 3);

        integers.stream()
                .map(s -> s + "번")
                .forEach(System.out::println);

        List<String> list = List.of("java", "spring", "css", "html", "sql");

        Optional<String> r1 = list.stream()
                .reduce((a, b) -> a + b);
        System.out.println(r1.orElse(""));

        Optional<Integer> r2 = list.stream()
                .map(s -> s.length())    // 글자수를 Integer로 변경
                .reduce((a, b) -> a + b);
        System.out.println(r2.orElse(0));

    }
}
