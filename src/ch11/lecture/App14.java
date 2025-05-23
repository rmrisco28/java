package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App14 {
    public static void main(String[] args) { //throws FileNotFoundException
        // 어디선가는 잡아줘야 프로그램이 실행됨
        try {
            method4();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // 근데 만약에 프로그램을 종료 시킬 생각이 있다면, 안해도 된다.
    }

    public static void method1() throws FileNotFoundException {
        FileInputStream fio = new FileInputStream("");
    }

    public static void method2() throws FileNotFoundException {
        // 여기서 선택.
        // 메소드에서 실행할거냐, 명시할꺼냐
        method1();
    }

    public static void method3() throws FileNotFoundException {
        method2();
    }

    public static void method4() throws FileNotFoundException {
        method3();
    }
}
