package ch15.lecture.p03map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App01 {
    public static void main(String[] args) {
        // map: entry(Key, value)를 저장
        // 중복된 key를 저장 할 수 없음

        Map<String, String> map = new HashMap<>();

        // entry 추가
        map.put("점심", "제육");
        map.put("저녁", "돈까스");
        map.put("아침", "베이글");
        // 같은 키로 다른 값을 추가한다면
        // 마지막에 넣은 value값이 덮어쓴다.
        map.put("저녁", "감자탕");
        System.out.println(map);

        // 몇개의 entry가 있는지 확인
        int size = map.size(); // 몇개 있는지
        System.out.println("size = " + size);
        boolean empty = map.isEmpty(); // 있는지 없는지 참 거짓으로
        System.out.println("empty = " + empty);

        // key가 있는지 확인
        boolean r1 = map.containsKey("아침");
        System.out.println("r1 = " + r1);
        boolean r2 = map.containsKey("간식");
        System.out.println("r2 = " + r2);

        // key로 value 얻기
        String v1 = map.get("아침");
        System.out.println("v1 = " + v1);
        String v2 = map.get("점심");
        System.out.println("v2 = " + v2);
        String v3 = map.get("저녁");
        System.out.println("v3 = " + v3);


        // key 집합(set) 얻기
        // set으로 가져오기 때문에
        Set<String> strings = map.keySet();
        System.out.println("strings = " + strings);

        // entry 삭제
        String v4 = map.remove("저녁");
        System.out.println("v4 = " + v4); // 지운 value 리턴
        System.out.println(map);
        String v5 = map.remove("간식");
        System.out.println("v5 = " + v5); // 지운 값이 없기 때문에 null


        // value 를 얻기
        map.put("저녁", "베이글");
        Collection<String> values = map.values();
        System.out.println("values = " + values);
    }
}
