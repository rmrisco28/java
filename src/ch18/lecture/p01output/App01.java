package ch18.lecture.p01output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
    public static void main(String[] args) throws IOException {
        // output Stream : (출력) 프로그램에서 나가는 데이터 스트림
        // byte 단위로 출력


        String fileName = "C:\\Temp/output1.text";
        OutputStream os = new FileOutputStream(fileName);

        // 쓰는게 주 역할이니, write
        // int 값을 파라미터로 받아도,
        // 끝의 8bite만 사용하고 24bits는 무시함.
        os.write(100);
        os.write(200);
        os.write(300);

        System.out.println("프로그램 종료");

    }
}
