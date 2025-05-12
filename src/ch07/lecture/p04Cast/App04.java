package ch07.lecture.p04Cast;

public class App04 {
    public static void main(String[] args) {
        SubClass041 a = new SubClass041();
        // 자동 형변환
        SuperClass04 b = a;

        // 강제 형변환 가능
        SubClass041 c = (SubClass041) b;


        // 강제형변환 불가능
        // 사촌이기 때문에
//        SubClass042 d = (SubClass042) b;

        System.out.println("프로그램 종료");
    }
}

// @formatter : 0ff
class SuperClass04 {
}

class SubClass041 extends SuperClass04 {
}

class SubClass042 extends SuperClass04 {
}


