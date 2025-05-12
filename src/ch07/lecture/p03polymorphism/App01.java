package ch07.lecture.p03polymorphism;

public class App01 {
    public static void main(String[] args) {
        // 자동형변환
        SuperClass01 a = new SuperClass01();
        SubClass011 b = new SubClass011();
        SuperClass01 c = a;
        SubClass011 d = b;
        // 노란 재규어는 재규어를 상속받았기때문에
        // 노란 재규어는 재규어에 들어갈 수 있다.
        SuperClass01 e = b; /// 자동형변환

        System.out.println(a == c);
        System.out.println(d == b);
        System.out.println(e == b);
        System.out.println(d == e);

        SubClass012 f = new SubClass012();
        SuperClass01 g = f; /// 자동형변환
        System.out.println(f == g);
        SuperClass01 h = new SubClass011(); /// 자동형변환

/*        // 아래 코드들은 안됨
        SuperClass01 i = new SuperClass01();
        SubClass011 j = i;
        SubClass012 k = i;

        SubClass012 n = new SubClass012();
        SubClass012 m = l; // x
        SubClass011 */
    }
}

// @formatter: off
class SuperClass01 {
} // 재규어라고 생각하고,

class SubClass011 extends SuperClass01 {
} // 노란 재규어

class SubClass012 extends SuperClass01 {
} // 검은 재규어
//@formatter: on
