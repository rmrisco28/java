package practice.d250526.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class App01_read2 {
    public static void main(String[] args) throws IOException {
        String file = "C:/Temp/practice/text01.data";

        InputStream is = new FileInputStream(file);
        while (true) {
            int read = is.read();
            if (read == -1) break;
            System.out.println(read);

        }
    }
}
