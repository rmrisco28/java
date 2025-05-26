package practice.d250526.IOStream;

import java.io.*;
import java.util.Arrays;

public class App02 {
    public static void main(String[] args) {
        String file = "C:/Temp/practice/text02.data";
        try (OutputStream os = new FileOutputStream(file)) {
            for (int i = 0; i < 35; i++) {
                os.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("생성완료");

        byte[] data = new byte[10];
        try {
            InputStream is = new FileInputStream(file);
            int length = 10;
            for (int i = 0; i < is.read(data); i++) {
                byte[] copy = Arrays.copyOf(data, length);
                System.out.println(Arrays.toString(copy));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
