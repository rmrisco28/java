/*
package ch18.exercise.P10;

import java.io.*;

public class Example {
    public static void main(String[] args) {
        String origin = "images/eagle.jpg";
        String target = "C:/Temp.eagle.jpg";
        // 파일 복사 코드를 작성
        // BufferdinputStream, BufferdOutputStream 활용

        try (InputStream is = new FileInputStream(origin)) {
            BufferedInputStream bis = new BufferedInputStream(is);
            byte[] data = new byte[1024];
            int len = 0;
            while ((len = bis.read(data)) != -1) {

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (OutputStream os = new FileOutputStream(target)) {
            BufferedOutputStream bos = new BufferedOutputStream(os);
            bos.write(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
