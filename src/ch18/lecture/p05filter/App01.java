package ch18.lecture.p05filter;

import java.io.*;

public class App01 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Temp/filter01.txt";
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
        // Buffered  Reader: 문자들을 buffer에 넣어놓고 한 번에 읽음(String으로 읽어냄)
        BufferedReader br = new BufferedReader(reader); // 파라미터를 다른 리더 변수를 받아야한다.

        try (br; reader) {
            int r1 = br.read();
            System.out.println("(char) r1 = " + (char) r1);
            String r2 = br.readLine();
            System.out.println("r2 = " + r2);
        }
    }
}
