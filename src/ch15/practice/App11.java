package ch15.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App11 {
    public static void main(String[] args) {


        ///  1번 문제
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "cherry", "banana"));
        List<String> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!list1.contains(list.get(i))) {
                list1.add(list.get(i));
            } else {
//                list1.add(list.get(i));
            }

        }
        System.out.println(list1);

        /// 2번문제

        List<Integer> num = new ArrayList<>((Arrays.asList(12, 3, 7, 99, 5, 24)));
        int max = num.get(0);
        int min = num.get(0);


        for (int i = 0; i < num.size(); i++) {
            max = max > num.get(i) ? max : num.get(i);
            min = min < num.get(i) ? min : num.get(i);
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println("-----------------------");
        ///  3번문제
        List<String> st = new ArrayList<>((Arrays.asList("kiwi", "banana", "fig", "apple")));
        int a = 0;
        int b = st.get(0).length();
        for (int i = 0; i < st.size(); i++) {
            for (int j = 0; j < st.size(); j++) {
                a = st.get(i).length();
            }
            if (b > a) {
                st.set(i, st.get(i));
            }
        }

        System.out.println(st);

    }
}
