package ch17.exercise.p08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> map = list.stream()
                .collect(Collectors.groupingBy(Member::getJob));

        System.out.println("[개발자]");
        for (Member member : map.get("개발자")) {
            System.out.println(member);

        }
        System.out.println();


        System.out.println("[디자이너]");
//        map.forEach(map.get("디자이너"));

    }
}
