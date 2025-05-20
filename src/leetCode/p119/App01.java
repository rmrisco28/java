package leetCode.p119;

import java.util.ArrayList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> list = new ArrayList<>();
        list.add(1); // 0 번째 행 1값


        for (int i = 0; i < rowIndex; i++) {
            List<Integer> list1 = new ArrayList<>();
            list1.add(1); // 0 번째 행 1값
            for (int j = 1; j < list.size(); j++) {
                list1.add(list.get(j - 1) + list.get(j));
            }
            list1.add(1);
            list = list1;
        }
        System.out.println("list = " + list);

    }
}
