package practice.d250527.filter;

import java.io.*;

public class App01 {
    public static void main(String[] args) throws IOException {
        String file = "C:/Temp/practice01.txt";

        try (OutputStream os = new FileOutputStream(file)) {
            OutputStreamWriter osw = new OutputStreamWriter(os);

            try (osw; os) {
                osw.write("아이러브");
                osw.write("아이시떼루");
                osw.write("❤️");
                osw.flush();
                PrintStream ps = new PrintStream(os);
                ps.println("다음글자");
                ps.flush();

            }
        }


    }
}
