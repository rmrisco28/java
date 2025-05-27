package ch18.lecture.p06file;

import java.io.*;

public class App02 {
    public static void main(String[] args) throws IOException {
        // 존재하지 않는 디렉토리를 만드는 방법

        // mkdir()는 폴더 하나 만드는 메소드.

/*        String d1 = "C:/Temp/some";
        File f1 = new File(d1);
        System.out.println(f1.exists());

        if (!f1.exists()) {
            f1.mkdir();
        }*/

        //mkdirs()는 한번에 여러 디렉토리를 만들수 있음
        String d2 = "C:/Temp/some/sub";
        File f2 = new File(d2);
        System.out.println(f2.exists());
        if (!f2.exists()) {
            f2.mkdirs();
        }

        String file = "C:/Temp/some/sub/file2.txt";
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);
        try (ps; fos) {
            ps.println("hello file");
            ps.flush();

        }
    }
}
