package practice.d250526.IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Temp/practice/text01.data";
        OutputStream os = new FileOutputStream(fileName);

        os.write(100);
        os.write(200);
        os.write(300);

        System.out.println("프로그램 완료");

    }
}
