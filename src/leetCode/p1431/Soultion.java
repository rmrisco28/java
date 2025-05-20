package leetCode.p1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soultion {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> kids = Arrays.stream(candies).boxed().toList();

        // 1. kids List에서 가장 큰 값 구하기
        int max = 0;
        for (Integer c : kids) {
            max = Math.max(max, c);
        }

        // 2. List<Boolean> result 객체 만들기
        List<Boolean> result = new ArrayList<>();

        // 3. kids 의 각 요소에 extraCandy 더해서  (1에서 구한 가장 큰 값) 보다 크거나 같으면
        // result에 true 추가
        // 아니면 false 추가
        for (Integer c : kids) {
            if (c + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
/*
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(3);
        System.out.println(list);

        int candy = 3;
        int kids = 0;
        int result = 0;
        // for
        for (int i = 0; i < list.size(); i++) {
            kids = list.get(i) + candy;
            System.out.println(kids);
            for (int j = 0; j < list.size(); j++) {
//                System.out.println(list.get(j));
                kids = kids > list.get(j) ? kids : list.get(j);
                if (kids > list.get(j)) {
                    list.set(i, true);
                } else {
                    list.set(i, false);
                }
            }
        }*/

}

