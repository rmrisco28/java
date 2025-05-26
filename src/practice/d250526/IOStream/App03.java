package practice.d250526.IOStream;

import java.io.*;

public class App03 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Temp/practice/reader1.txt";
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
        Reader read = new FileReader(fileName);
        char[] data = new char[10];
        int length = read.read(data);

        System.out.println(length);

    }
}
