package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App02 {
    public static void main(String[] args) {
        // list: 요소의 순서가 있는 콜렉션
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("spring");
        list.add("react");
        list.add("sql");
        list.add("html");

        // 전체 탐색
        // for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // enhanced for
        System.out.println("---------enhanced for-------------");
        for (String item : list) {
            // 리스트 값을 itme 에 한번씩 넣는다.
            System.out.println(item);
        }

        // Iterator
        System.out.println("--------interator----------");
        Iterator<String> iterator = list.iterator();
        //while 문이랑 잘어울림
        // itertor.hasNext가  다음 목록이 있는지를 알려주는것.
        // 없다면 false기 때문에 while문 종료
        // 잘 안쓰긴 함.
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        // forEach
        System.out.println("-----forEach-----");
        list.forEach(x -> System.out.println(x));
        list.forEach((System.out::println));

        // stream
        System.out.println("------stream------");
        list.stream().forEach(System.out::println);
    }
}

