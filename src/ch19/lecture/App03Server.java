package ch19.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class App03Server {
    public static void main(String[] args) throws Exception {
        String file = "images/eagle.jpg";
        // server: client 연결 기다림
        ServerSocket serverSocket = new ServerSocket(9876);

        try (serverSocket) {
            for (int i = 0; i < 20; i++) {
                Socket socket = serverSocket.accept();
                // 람다 안에선 런 메소드이기때문에 catch로 잡아줘야함
                Thread t = new Thread(() -> {
                    try (socket) {

                        OutputStream os = socket.getOutputStream();
                        BufferedOutputStream bos = new BufferedOutputStream(os);
                        //  os 파일 보내기
                        FileInputStream fis = new FileInputStream(file);
                        BufferedInputStream bis = new BufferedInputStream(fis);
                        try (bis; fis; bos; os) {

                            byte[] data = new byte[1024];
                            int len = 0;

                            while ((len = bis.read(data)) != -1) {
                                bos.write(data, 0, len);
                            }
                            bos.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                t.start();

                System.out.println((i + 1) + "명이 다운로드함");
            }
        }
    }
}
