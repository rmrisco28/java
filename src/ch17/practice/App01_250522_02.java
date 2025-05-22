package ch17.practice;

import java.util.List;
import java.util.Optional;

public class App01_250522_02 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 4, 6, 8, 10);

        list.stream()
                .filter(a -> a < 5)
                .max(Integer::compareTo);

    }
}
