package leetCode.p2114;

import java.util.Arrays;

public class Solution {
    public int mostWordsFound(String[] sentences) {

/*        int max = 0;
        for (String s : sentences) {
            int length = s.split(" ").length;
            max = Math.max(max, length);
        }
        return max;
        */

        return Arrays.stream(sentences)
                .map(s -> s.split(" "))
                .mapToInt(s -> s.length)
                .max()
                .getAsInt();


    }
}
