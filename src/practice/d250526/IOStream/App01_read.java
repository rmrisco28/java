package practice.d250526.IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class App01_read {
    public static void main(String[] args) {
        String file = "C:/Temp/practice/text01.data";

        try (InputStream is = new FileInputStream(file)) {
            int r1 = is.read();
            int r2 = is.read();
            int r3 = is.read();
            int r4 = is.read();

            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
            System.out.println("r3 = " + r3);
            System.out.println("r4 = " + r4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
