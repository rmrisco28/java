package ch17.lecture.p02terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App05 {
    public static void main(String[] args) {
        // 다양한 요소를 다른 컬렉션으로 모으는 메소드
        // collect: 요소들을 수집해서 collection(List, Set, Map)을 결과로 냄.

        List<String> list = List.of("java", "spring", "css", "react", "html");
        // 문자열의 길이를 숫자로 list로 변환해서 쓰고 싶다.
        List<Integer> c1 = list.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println("c1 = " + c1);

        // set으로 수집
        Set<Integer> c2 = list.stream()
                .map(s -> s.length())
                .collect(Collectors.toSet());
        System.out.println("c2 = " + c2);

        Map<String, Integer> c3 = list.stream()
                .collect(Collectors.toMap(s -> s, s -> s.length()));// key와 value는 어떻게 할지 넣어야함.
        System.out.println("c3 = " + c3);

        // list로 자주 변환함. tolist 메소드 사용
        List<Integer> c4 = list.stream()
                .map(s -> s.length())
                .toList();
        System.out.println("c4 = " + c4);
    }
}
