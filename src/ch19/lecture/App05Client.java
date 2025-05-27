package ch19.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class App05Client {
    public static void main(String[] args) {
        String file = "C:/Temp/image.jpg";
        // server에게 file 보내기
        // 192.168.0.5:9876
        try {
            Socket socket = new Socket("192.168.0.5", 9876);

            try {
                FileInputStream fis = new FileInputStream(file);
                BufferedInputStream bis = new BufferedInputStream(fis);
                OutputStream os = socket.getOutputStream();
                BufferedOutputStream bos = new BufferedOutputStream(os);
                try (bos; fis; bis; os) {

                    byte[] data = new byte[1024];
                    int len = 0;
                    while ((len = bis.read(data)) != -1) {
                        bos.write(data, 0, len);
                    }
                    bos.flush();
                }
                System.out.println("보내기 완료");

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
