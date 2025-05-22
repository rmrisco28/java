package ch17.lecture.p02terminal;

import java.util.List;
import java.util.Optional;

public class App03 {
    public static void main(String[] args) {
        // reduce: 집계 연산
        // 전체 객체의 계산을 할때 사용( 글자수, 글자크기등)

        List<String> list = List.of("java", "spring", "css", "html", "sql");
        // a,b에 java spring이들어가고
        // a+b 값이 a가 됨.
        // 맨처음부터 원소가 없었을 수도 있기 때문에 Optional로 변환

        // 모든 요소 연결
        Optional<String> r1 = list.stream()
                .reduce((a, b) -> a + b);
        System.out.println(r1.orElse(""));
        // r1가 없으면 ""로 한다.

        // 모든 요소의 글자수 더하기
        Optional<Integer> r2 = list.stream()
                .map(s -> s.length()) // 글자수를 Integer로 변경
                .reduce((a, b) -> a + b);
        // 맨처음부터 원소가 없었을 수도 있기 때문에 Optional로 변환
        System.out.println(r2.orElse(0));
        // r1가 없으면 0로(타입이 동일해야함) 한다.


    }
}
