package ch18.exercise.p07;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException {
        String filePath = "src/ch18/exercise/p07/Example.java";
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            String str = br.readLine();
            if (str == null) break;
            rowNumber++;
            System.out.println(rowNumber + "\t" + str);

        }
        br.close();
        fr.close();

    }
}
