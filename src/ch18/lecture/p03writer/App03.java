package ch18.lecture.p03writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App03 {
    public static void main(String[] args) throws IOException {
        try (Writer writer = new FileWriter("C:/Temp/writer03.txt")) {
            writer.write('a');
            writer.write('한');
            writer.write('\u2669');
            writer.write("🧢"); //이모지는 2bytes가 넘어가기 때문에 String으로 작성
            writer.flush();
        }
    }
}
