package ch17.lecture.p02terminal;

import java.util.List;

public class App04 {
    public static void main(String[] args) {
        // 집계연산

        List<String> list = List.of("java", "spring", "css", "html", "sql");

        // 모든 요소 연결
        String r1 = list.stream()
                .reduce("", (a, b) -> a + b);
        // 아까와 값이 같지만, 초기값을 주어서 Optional 설정안됨

        System.out.println("r1 = " + r1);

        Integer r2 = list.stream()
                .map(s -> s.length())
                .reduce(0, (a, b) -> a + b);

        System.out.println("r2 = " + r2);

        // 초기값으로 

    }
}
