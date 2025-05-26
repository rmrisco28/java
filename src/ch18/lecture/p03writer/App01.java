package ch18.lecture.p03writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
    public static void main(String[] args) throws IOException {
        try (OutputStream os = new FileOutputStream("C:/Temp/writer01.txt")) {
            os.write(97);
            os.write(100);
            os.write(103);
            os.write(33);
            // byte로 써도 글자를 쓸 수 있구나~

            os.write('t'); // 가능
            os.write('걸'); // 불가능

            os.flush();
        }
    }
}
