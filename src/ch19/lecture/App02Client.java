package ch19.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class App02Client {
    public static void main(String[] args) throws Exception {
        String file = "C:/Temp/download.jpg";

        // client: server에 연결 시도
        // 서버의 주소를 알아야함
        Socket socket = new Socket("192.168.0.5", 9876);
        try (socket) {
            // is 로 받기
            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            // 파일 받는 쪽, 디스크에 써야 한다.
            FileOutputStream fos = new FileOutputStream(file);
            //효율적으로 받기위해 bufferd
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            try (bos; fos; bis; is) {

                byte[] data = new byte[1024];
                int len = 0;

                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
        }
    }
}
