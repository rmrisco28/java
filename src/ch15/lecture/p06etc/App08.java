package ch15.lecture.p06etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App08 {
    public static void main(String[] args) {
        //List.of, Set.of, Map.of : umodifialbe 콜렉션 생성
        List<Integer> list1 = List.of(100, 500, 300);
        // 추가 변경 삭제 등 안됨.
//        list1.remove(0);
//        list1.set(0, 1);
//        list1.add(700);
//        Collections.sort(list1);
        // 모두 수정불가.
        // 하고 싶다면, 해당 리스트를 받는 리스트를 새로 만들어야함

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        list2.remove(0);
        list2.set(0, 1);
        list2.add(700);
        Collections.sort(list2);
        System.out.println(list2);

    }

}
