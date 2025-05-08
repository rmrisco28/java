package ch06.sec07.exam02;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    public Korean(String name, String ssn) {
        // 의미있는 파라미터 변수명으로 작성하기 위해 필드에서사용된 변수 사용을 위해 this를 붙임
        this.name = name;
        this.ssn = ssn;
    }
}
