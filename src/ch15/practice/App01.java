package ch15.practice;

import java.util.ArrayList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        List<String> app1 = new ArrayList<>();

        app1.add("apple");
        app1.add("banana");
        app1.add("cherry");

        app1.remove(2);

        System.out.println(app1);
    }
}
