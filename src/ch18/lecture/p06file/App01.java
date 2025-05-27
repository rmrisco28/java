package ch18.lecture.p06file;

import java.io.File;

public class App01 {
    public static void main(String[] args) {
        // File: file 정보를 담고있는 객체
        // 파일 객체 만들때
        File f1 = new File("C:/Temp/nothing.txt");
        File f2 = new File("C:/Temp/bear.jpg");


        // exists  (파일 존재 여부)
        boolean r1 = f1.exists();
        System.out.println("r1 = " + r1);
        boolean r2 = f2.exists();
        System.out.println("r2 = " + r2);

        // getName (파일의 이름)
        String n1 = f2.getName();
        System.out.println("n1 = " + n1);

        // getPath (파일의 경로)
        String p1 = f2.getPath();
        System.out.println("p1 = " + p1);

        // length(파일의 크기)
        long l2 = f2.length();
        System.out.println("l2 = " + l2);

        // isDirectory
        boolean d2 = f2.isDirectory();
        System.out.println("d2 = " + d2);

        // isFile (파일 인지 아닌지)
        boolean i2 = f2.isFile();
        System.out.println("i2 = " + i2);
    }
}


