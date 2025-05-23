package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
/*
        // List 컬렉션 생성
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("신용권", 10));
        studentList.add(new Student("유미선", 20));
*/
        List<Student> studentList = List.of(
                new Student("홍길동", 30),
                new Student("신용권", 10),
                new Student("유미선", 20)
        );


        // 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
        studentList.stream()
                .sorted((s1, s2) -> Integer.compare((s1.getSocre()), s2.getSocre()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getSocre()));
        System.out.println();

        // 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getSocre(), s1.getSocre()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getSocre()));
        System.out.println();

        // 이름 순으로
        studentList.stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getSocre()));

    }
}
