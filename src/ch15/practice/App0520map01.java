package ch15.practice;

import java.util.HashMap;
import java.util.Map;

public class App0520map01 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("홍길동", "010-1234-5678");
        map.put("이순신", "010-1111-2222");

        String s1 = map.get("홍길동");
        System.out.println(s1);

        map.forEach((k, v) -> System.out.println(v));
    }
}
