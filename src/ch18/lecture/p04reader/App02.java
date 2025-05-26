package ch18.lecture.p04reader;

import java.io.*;

public class App02 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Temp/reader09.txt";
        // reader 연습용 파일
        try (Writer writer = new FileWriter(fileName)) {
            writer.write('a'); // 1
            writer.write('한'); // 1
            writer.write('글'); // 1
            writer.write("날"); // 2
            writer.write("🧢");  // 3
            writer.flush();
        }

        // reader 연습
        try (Reader reader = new FileReader(fileName)) {
            char[] data = new char[10];
            int length = reader.read(data);
            // 근데 String 으로 바로 받는건 없을까?

            System.out.println("length = " + length);
        }


    }
}
