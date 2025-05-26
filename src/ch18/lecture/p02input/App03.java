package ch18.lecture.p02input;

import java.io.*;
import java.util.Arrays;

public class App03 {
    public static void main(String[] args) throws IOException {
        //inputStream 에서 사용할 파일을 먼저 만들기

        String fileName = "C:/Temp/input03.data";
        try (OutputStream os = new FileOutputStream(fileName)) {
            for (int i = 0; i < 35; i++) {
                os.write(i);
            }
        }
        System.out.println("파일 만들기 종료");

        // inputStream으로 읽기

        byte[] datas;
        try (InputStream is = new FileInputStream(fileName)) { // 35bytes 파일 크기

            datas = new byte[10];
            int r1 = is.read(datas); // 몇 byte 읽었는지 return
            System.out.println(Arrays.toString(datas));
            int r2 = is.read(datas);
            System.out.println(Arrays.toString(datas));
            int r3 = is.read(datas);
            System.out.println(Arrays.toString(datas));
            int r4 = is.read(datas);
            System.out.println(Arrays.toString(datas));
            int r5 = is.read(datas);
            System.out.println(Arrays.toString(datas));


            System.out.println("r1 = " + r1); // 10
            System.out.println("r2 = " + r2); // 10
            System.out.println("r3 = " + r3); // 10
            System.out.println("r4 = " + r4); // 5
            System.out.println("r5 = " + r5); // -1

            // 남은 5byte 만큼 읽은 것이기 때문에, 남아있던 배열은 값을 그대로 출력


        }

    }
}
