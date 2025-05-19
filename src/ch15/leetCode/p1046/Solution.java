package ch15.leetCode.p1046;

import ch15.leetCode.p1431.Soultion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int s : stones) {
            list.add(s);
        }

        // 1. 정렬
        Collections.sort(list);
        Collections.reverse(list);
        // 2. 마지막 index의 요소와 마지막 -1 index 요소를 꺼내고(지우고)

        // 3. 차이를 구함. (또는  list에 다시 넣고
        // 반복
        while (list.size() > 1) {

            //874211
            if (list.get(0) - list.get(1) != 0) {
                list.add(list.get(0) - list.get(1));
            } else {

            }
            list.remove(0);
            list.remove(0);
        }

        return list.size() == 0 ? 0 : list.get(0);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(7);
        list.add(4);
        list.add(1);
        list.add(8);
        list.add(1);


        while (list.size() > 1) {
            Collections.sort(list);
            Collections.reverse(list);

            //874211
            if (list.get(0) - list.get(1) != 0) {
                list.add(list.get(0) - list.get(1));
            } else {

            }
            list.remove(0);
            list.remove(0);
        }
   
        System.out.println(list);
    }
}
