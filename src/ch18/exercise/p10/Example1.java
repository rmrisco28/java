package ch18.exercise.p10;

import java.io.*;

public class Example1 {
    public static void main(String[] args) {
        String origin = "images/eagle.jpg";
        String target = "C:/Temp/eagle.jpg";

        // 파일 복사 코드 작성
        // BufferedInputStream, BufferedOutputStream 활용

        long start = System.nanoTime();
        try {
            InputStream is = new FileInputStream(origin);
            BufferedInputStream bis = new BufferedInputStream(is);
            OutputStream os = new FileOutputStream(target);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            try (is; os; bis; bos;) {
                byte[] data = new byte[1000];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();

        long diff = end - start;

        System.out.println("diff = " + diff);
        // 3000000
    }
}