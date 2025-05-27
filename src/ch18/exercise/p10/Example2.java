package ch18.exercise.p10;

import java.io.*;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) throws IOException {
        String start = "C:/Temp/dir1/lion.jpg";
        String end = "C:/Temp/dir2/lion.jpg";
        String dir = "C:/Temp/dir2";

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("원본 파일 경로: ");
        start = scanner.nextLine();
        System.out.println("복사 파일 경로: ");
        end = scanner.nextLine();
        */

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("원본 파일 경로: ");
        start = br.readLine();
        System.out.println("복사 파일 경로: ");
        end = br.readLine();


        File f1 = new File(end);
        File f2 = new File(dir);

        if (!f2.exists()) {
            System.out.println("원본파일이 존재하지 않습니다.");
            if (!f2.exists()) {
                f2.mkdirs();
            }
        } else {

            InputStream is = new FileInputStream(start);
            OutputStream os = new FileOutputStream(end);

            BufferedInputStream bis = new BufferedInputStream(is);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            try (bos; bis; os; is) {
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }

            if (f1.exists()) {
                System.out.println("복사가 성공되었습니다.");
            }
        }


    }
}
