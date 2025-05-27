package ch19.lecture;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class App04Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("192.168.0.5", 9876);) {
            OutputStream os = socket.getOutputStream();
            // 한글, 문자들도 보내야하니, 아웃풋을 wrtier로 변환
            OutputStreamWriter osw = new OutputStreamWriter(os);
            // 효율적으로 쓰기위해
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(osw);

            Scanner scanner = new Scanner(System.in);

            try (pw; bw; osw; os; scanner) {
                while (true) {
                    System.out.print("입력>");
                    String messages = scanner.nextLine();
                    pw.println(messages);
                    pw.flush();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
