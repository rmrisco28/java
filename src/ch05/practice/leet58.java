package ch05.practice;

public class leet58 {
    public static void main(String[] args) {
        String s = "Hello java";
        // s를 strip 해서 양끝의 공백 제거
        String a = s.strip();

        // 공백 기준으로 split한 배열의 마지막 인덱스의 길이를 리턴
        String[] b = a.split(" ");
        b[b.length - 1].length();
        
    }
}
