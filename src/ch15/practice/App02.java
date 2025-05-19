package ch15.practice;

import java.util.ArrayList;
import java.util.List;

public class App02 {
    public static void main(String[] args) {
        List<String> app02 = new ArrayList<>();
        app02.add("cat");
        app02.add("dog");
        app02.add("bird");

        boolean b1 = app02.contains("dog");
        if (b1 == true) {
            System.out.println("존재함");
        } else {
            System.out.println("존재하지 않음");
        }
    }
}
