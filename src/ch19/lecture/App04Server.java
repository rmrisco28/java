package ch19.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class App04Server {
    public static void main(String[] args) {
        // 서버는 클라이언트가 접속하기를 기다린다.

        try (ServerSocket serverSocket = new ServerSocket(9876)) {

            // 반복해서 여러변 뿌리기 위해
            for (int i = 0; i < 100; i++) {
                Socket socket = serverSocket.accept();
                String client = socket.getRemoteSocketAddress().toString();

                // 보내는것을 반복해야하니 Thread
                Thread thread = new Thread(() -> {
                    try (  // 메시지를 받을 것이니까
                           InputStream is = socket.getInputStream();
                           // 이모티콘이나 한글도 있을수있으니, reader로 감싼다
                           InputStreamReader isr = new InputStreamReader(is);
                           // 효율적으로 하기 위해 buffered로 감싼다
                           BufferedReader br = new BufferedReader(isr);) {

                        //화면에보여줄껀 outputStream을써야하는데 간단하게 systemout사용
                        String message = null;
                        while ((message = br.readLine()) != null) {
                            System.out.println(message);

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                });
                thread.start();
            }
        } catch (
                Exception e) {
            e.printStackTrace();
        }

    }
}
