package ch15.practice;

import java.util.HashSet;
import java.util.Set;

public class App0520set01 {
    public static void main(String[] args) {
        String[] words = {"java", "spring", "java", "html", "css", "html"};

        Set<String> set = new HashSet<>();
        for (String a : words) {
            set.add(a);
        }
        System.out.println(set);

        String s = "spring";
        String p = "python";
        if (set.remove(s)) {
            System.out.println("\"" + s + "\"" + "은 포함되어 있습니다.");
        } else {
            System.out.println("\"" + s + "\"" + "은 포함되어 있지  있습니다.");
        }
        if (set.remove(p)) {
            System.out.println("\"" + p + "\"" + "은 포함되어 있습니다.");
        } else {
            System.out.println("\"" + p + "\"" + "은 포함되어 있지  있습니다.");
        }
    }
}
