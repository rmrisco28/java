package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App01 {
    public static void main(String[] args) {
        // set: 같은 객체를 여러번 저장 할 수 없음.
        //      탐색 순서가 보장되지 않음. // 보장되는 클래스도 있다. treeSet

        Set<String> set = new HashSet<>();

        //  요소(element) 추가
        set.add("java");
        boolean spring = set.add("spring");
        System.out.println("spring = " + spring);
        set.add("html");
        System.out.println(set);
        set.add("css");
        System.out.println(set);
        boolean spring1 = set.add("spring");// 이미 있었기때문에 실패
        System.out.println("spring1 = " + spring1);
        System.out.println(set);
        set.add(null);
        System.out.println(set);
        set.add(null);
        System.out.println(set);
        //add 메소드는 boolean을 리턴.
        // 처음 넣었다면 true
        // 넣었던 객체가 있다면 false

        System.out.println("------요소 삭제---------");
        // 요소 삭제
        // set은 요소를 삭제할때 인덱스로 지울 수없고, 객체 자체를 넣어야 지울 수 있음
        boolean spring2 = set.remove("spring");
        System.out.println("spring2 = " + spring2);
        System.out.println(set);
        set.remove(null);
        System.out.println(set);
        boolean react = set.remove("react");// 없는걸 지워도 일도 일어나지 않는다.
        // 지워졌는지 안지워졌는지도 확인할 수 있는 boolean 타입.
        // 지워졌다면 true, 못지웠다면 false
        System.out.println("react = " + react);
        System.out.println(set);

        // 요소의 갯수 확인
        int size = set.size();
        System.out.println("size = " + size);
        boolean empty = set.isEmpty();// 비어있는지 확인
        System.out.println("empty = " + empty);
        // 안비어있을때 참을 받을경우 ! 사용
        boolean empty2 = !set.isEmpty();
        System.out.println("empty2 = " + empty2);

// 전체 탐색하기 // 는 다음 파일에서
    }
}
