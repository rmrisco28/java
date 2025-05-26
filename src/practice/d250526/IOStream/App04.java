package practice.d250526.IOStream;

import java.io.*;
import java.nio.Buffer;

public class App04 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Temp/practice/text02.txt";
        // reader 연습용 파일
        try (Writer writer = new FileWriter(fileName)) {
            writer.write('a'); // 1
            writer.write('한'); // 1
            writer.write('글'); // 1
            writer.write("날"); // 2
            writer.write("🧢");  // 3
            writer.flush();
        }

        Reader reader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(reader);

        try (reader; br) {

            int r1 = br.read();
            String r2 = br.readLine();
            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
        }
    }
}
