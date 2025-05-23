package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App12 {
    public static void main(String[] args) {
        //18 장 정도 되는 내용

        try {
            FileInputStream fis = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
