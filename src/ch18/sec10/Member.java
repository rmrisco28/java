package ch18.sec10;

import java.io.Serializable;

public class Member implements Serializable {
    // 생성자를 추가하거나, 삭제 수정하면 에러가 날 수도 있음.
    // 그래서 버전을 표시할 필요가 있었음.
    // 시리얼버전 UID를 작성.
    private static final long serialVersionUID = -622284561026719240L;
    private String id;
    private String name;


    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
