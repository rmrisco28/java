package ch17.exercise.p06;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        //고전적 for
        double sum = 0;
        for (Member member : list) {
            sum += member.getAge();
        }
        double avg1 = sum / list.size();
        System.out.println("avg = " + avg1);


        //참조타입 stream
        // 참조타입을 쓸꺼면 합계를 구한 다음, 나눴을것.
        Integer sum2 = list.stream()
                .map(Member::getAge)
                .reduce(0, Integer::sum);
        Double avg2 = sum2.doubleValue() / list.size();
        System.out.println("평균나이: " + avg2);

        // 기본 타입 stream
        Double avg3 = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();

        System.out.println("평균나이: " + avg3);
    }
}
