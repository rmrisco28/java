package ch17.lecture.p04primitive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App01 {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 5, 9, 7, 11, 20, 22, 11);
        Stream<Integer> stream1 = list.stream();
        Integer r1 = stream1.reduce(0, (a, b) -> a + b);
        System.out.println("r1 = " + r1);

        // 기본타입을 요소로 갖는 Stream
        // IntStream
        // LongStream

        // 유용한 reduce 메소드


        int[] arr1 = {3, 5, 9, 7, 11, 20, 22, 11};
        IntStream stream2 = Arrays.stream(arr1);
        int r2 = stream2.reduce(0, (a, b) -> a + b);
        System.out.println("r2 = " + r2);

        // 더하거나 찾거나 하는 값을 자주 구하게됨.
        // 자주 사용하는 reduce메소드 sum()을 사용해도 된다.

        IntStream stream3 = Arrays.stream(arr1);
        int sum = stream3.sum();
        System.out.println("sum = " + sum);

    }
}
