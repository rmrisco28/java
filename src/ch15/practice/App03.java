package ch15.practice;

import java.util.ArrayList;
import java.util.List;

public class App03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.set(1, 100);
        System.out.println(list);


        List<Integer> app04 = new ArrayList<>();
        app04.add(5);
        app04.add(10);
        app04.add(15);
        app04.add(20);
        app04.add(25);

        System.out.println(app04.size());

        List<Integer> app05 = new ArrayList<>();

        app04.add(1);
        app04.add(2);
        app04.add(3);
        app04.add(4);
        app04.add(5);

        for (int i = 0; i < app05.size(); i++) {
            if (app05.get(i) % 2 == 1) {
                app05.remove(i);
            }
        }
        System.out.println(app05);

    }
}
