package ch17.lecture.p04primitive;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class App03 {
    public static void main(String[] args) {
        int sum = IntStream.range(0, 10) // 0~9
                .sum();
        System.out.println("sum = " + sum);

        int sum1 = IntStream.range(1, 101)
                .sum();
        System.out.println("sum1 = " + sum1);

        int sum2 = IntStream.range(1, 101)
                .filter(e -> e % 2 == 0)
                .sum();
        System.out.println("sum2 = " + sum2);

        int sum3 = IntStream.rangeClosed(1, 10) // 1~10
                .sum();
        System.out.println("sum3 = " + sum3);

        long sum4 = LongStream.range(1, 10) // 1~9
                .sum();
        System.out.println("sum4 = " + sum4);
        long sum5 = LongStream.rangeClosed(1, 10)
                .sum();
        System.out.println("sum5 = " + sum5);

        // Random
        Random random = new Random();

        random.ints()
                .limit(5)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        random.ints(0, 10)// 시작값, 종료값, 0~9
                .limit(5)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        // 로또 번호 출력기
        random.ints(0, 45)
                .map(e -> e + 1)
                .distinct()
                .limit(6)
                .sorted()
                .forEach(System.out::println);


    }
}
