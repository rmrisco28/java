package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        // Collection: 객체를 저장한 객체(의 타입)
        // Collection Framework
        // : 객체를 저장한객체의 타입(클래스, 인터페이스)와 관련 된 메소드의 모음


        // list, set, map, stack, Queue
        // List: 저장된 요소의 순서가 있음
        // set: 중복된 요소를 저장하지 않음
        // Map: 키(key)를 값(value)에 매핑함(매핑: 짝을이룬다)
        // stack(LIFO): 마지막에 들어간 객체(데이터)가 먼저 출력됨 (Last In First Out)
        // Queue(FIFO): 먼저 들어간 객체가 먼저 출력됨 (First In Fisrt out)

        // List: 저장된 요소의 순서가 있음
        List<String> list = new ArrayList<>();

        // 요소(element) 추가
        System.out.println(list);
        list.add("java");
        System.out.println(list);
        list.add("spring");
        System.out.println(list);
        list.add("react");
        System.out.println(list);
        list.add("java");
        System.out.println(list);

        // 특정 위치에 넣기
        list.add(1, "sql");
        System.out.println(list);

        // 특정 위의 요소 교체
        // 2번째 인덱스의 값을 vue로 교체하겠다.
        list.set(2, "vue");
        System.out.println(list);

        // 몇 개의 요소가 있는지 확인 (integer 로 반환)
        int size = list.size();
        System.out.println("size = " + size);

        // 특정 요소가 있는지 (boolean 으로 반환)
        boolean r1 = list.contains("spring");
        System.out.println("r1 = " + r1);
        boolean r2 = list.contains("vue");
        System.out.println("r2 = " + r2);

        // 특정 위치의 요소 얻기
        String e1 = list.get(0);
        System.out.println("e1 = " + e1);
        String e2 = list.get(3);
        System.out.println("e2 = " + e2);

        String e3 = list.getLast(); // 마지막 인덱스 값 불러오기
        System.out.println("e3 = " + e3);
        String e4 = list.get(list.size() - 1);
        System.out.println("e4 = " + e4);

        // 특정 요소를 지우기
        list.remove("vue");
        System.out.println(list);
        list.remove("java"); // 현재 자바가 0,3번 인덱스에 들어가있는데
        // 먼저 확인 되는것이 지워짐
        // 잘 모르면 호버 해서 보면 됨.
        System.out.println(list);

        // 특정 위치의 요소 지우기
        String e5 = list.remove(0);// 반환하는 데이터는 지운객체를 반환 
        System.out.println("e5 = " + e5);
        System.out.println(list);

        // 강사님이 소개 해주겠지만 다 알려주는것이 아니기 때문에, API 접속해서 다른 메소드들 확인해보기
    }
}
