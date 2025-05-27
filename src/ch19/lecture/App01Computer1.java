package ch19.lecture;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class App01Computer1 {
    public static void main(String[] args) throws Exception {
        // 1번 컴퓨터에서 2번 컴퓨터로 연결하기
        // 1번 컴퓨터(Server) 받는 컴퓨터 기다리는 역할
        // 이곳에 어떤 포트를 쓸건지를 명시해줘야함 명시했다면 클라이언트는 포트번호를 알아야 쓸 수 있음
        ServerSocket serverSocket = new ServerSocket(9876);
        Socket socket = serverSocket.accept();
        // "hello" 메시지 보내기

        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        try (bw; osw; os) {
            bw.write("helo");
            bw.flush();
        }
    }
}