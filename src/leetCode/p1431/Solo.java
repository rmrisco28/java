package leetCode.p1431;

import java.util.*;
import java.util.stream.IntStream;

public class Solo {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        // 최대값구하기
        int asInt = Arrays.stream(candies)
                .max()
                .getAsInt();
        System.out.println("asInt = " + asInt);

        List<Boolean> list = Arrays.stream(candies)
                .mapToObj(c -> c + extraCandies >= asInt)
                .toList();
        System.out.println("list = " + list);
    }
}
