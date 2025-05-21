package ch17.sec07.exam01;

import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<Student> list = List.of(
                new Student("홍길동", 30),
                new Student("신용권", 10),
                new Student("유미선", 20)
        );
        // 점수를 기준으로 오름차순
        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .forEach(System.out::println);

        System.out.println();


        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }

}
