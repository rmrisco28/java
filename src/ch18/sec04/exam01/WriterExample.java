package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("C:/Temp/test.txt")) {

            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            // char 배열 출력
            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            // 문자열 출력
            writer.write("FGH");

            // 버퍼에 잔류하고 있는 모든 문자들을 출력하고 버퍼를 비움
            writer.flush();

            // 출력 스트림 을닫고 메모리 해제
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
