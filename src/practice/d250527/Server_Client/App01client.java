package practice.d250527.Server_Client;

import java.io.*;
import java.net.Socket;

public class App01client {
    public static void main(String[] args) {
        String file = "C:/Temp/image2.jpg";

        try {
            Socket socket = new Socket("192.168.0.20", 9876);

            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);
            try (bos; os; bis; fis) {
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
            System.out.println("보내기 성공");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
