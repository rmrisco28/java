package leetCode.p1748;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


public class Solution250522 {
    public int sumOfUnique(int[] nums) {

/*        Stream<Integer> boxed = Arrays.stream(nums)
                .boxed();
*/


        return Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting())).entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .mapToInt(Integer::intValue)
                .sum();

    }


}
