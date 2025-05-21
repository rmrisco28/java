package ch15.lecture.p06etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App07 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("css");
        list1.add("spring");
        System.out.println(list1);

        List<Object> list2 = List.of();//empty
        System.out.println(list2);

        List<String> list3 = List.of();
        System.out.println(list3);

        List<String> list4 = List.of("java", "css", "spring");
        System.out.println(list4);

        List<Integer> list5 = List.of(100, 50, 500, 200);
        System.out.println(list5);

        // Set.of : 요소의 나열로 set 만들기
//        Set<String> set1 = Set.of("java", "css", "spring", "css");
        // 중복값넣을 시 에러. 주의하자
        Set<String> set1 = Set.of("java", "css", "spring");
        System.out.println(set1);

        // Map.of: entry의 나열로 map 만들기
        // key, value 두개 씩 필요하기 때문에, 꼭 짝수개로 작성 필수
        // Map은 순서 보장이 안된다는것 기억
        Map<String, String> map1 = Map.of(
                "java", "spring",
                "python", "django",
                "js", "text");
        System.out.println(map1);

    }
}
