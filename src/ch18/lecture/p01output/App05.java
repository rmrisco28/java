package ch18.lecture.p01output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App05 {
    public static void main(String[] args) {
        String fileName = "C:/Temp/out4.data";

        // 예전에 작성하는 코드 스타일
        // 너무 길고, 불편한 코드
        OutputStream os = null;
        try {
            os = new FileOutputStream(fileName);
            os.write(3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close(); // 꼭 해야함.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 최신 기술
        // try-withresoures 사용
        // try의 () 내에 닫을 stream 선언하면
        // java가 새로 닫아줌
        try {
            OutputStream os2 = new FileOutputStream(fileName);
            os2.write(3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // os2.close() 사용하지 않고,
        // 닫는 행위를 jvm 에게 시킨다.


        // try-withresoures 사용
        // try의 () 내에 닫을 stream 선언하면
        // java가 새로 닫아줌
        try {
            OutputStream os3 = new FileOutputStream(fileName);
            try (os3) {
                os3.write(3);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
