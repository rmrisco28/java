package ch17.practice;

import java.util.List;
import java.util.Optional;

public class App01_2505222_01 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 6, 1, 4, 3, 2, 6, 5, 4, 2, 3, 1, 0, -1, 10, 5, 8, 8);

        Optional<Integer> max = list.stream()
                .skip(1)
                .filter(a -> a % 2 == 0)
                .distinct()
//                .sorted((a, b) -> b - a)
                .max((a, b) -> a - b);

        max.stream()
                .map(a -> a + "번")
                .forEach(System.out::println);

    }
}
