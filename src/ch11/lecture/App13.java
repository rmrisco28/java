package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App13 {
    public static void main(String[] args) {

        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //메소드에서 익셉션이라고 명시해놨기 때문에
        // 메소드를 쓰는 이곳에서 try-catch를 써야함
    }

    public static void method1() throws FileNotFoundException {
        // FileNotFoundException(checked exception)
        // 1. try-catch로 감싸거나
        // 2. method에 명시 하거나 (메소드 옆에 throws FileNotFoundException 라고 명시)

        FileInputStream fio = new FileInputStream("");
    }
}
