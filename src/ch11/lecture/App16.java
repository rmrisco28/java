package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App16 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 공통된 조상  Exception만 써도된다.
    public static void method1() throws Exception {
        FileInputStream fio = new FileInputStream("");
        Class.forName("");
    }
}
