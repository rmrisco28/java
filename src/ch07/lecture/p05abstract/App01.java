package ch07.lecture.p05abstract;

public class App01 {
    Chihuahua01 a = new Chihuahua01();
    Wolf01 b = new Wolf01();
    // 추상클래스(abstract class)로 인스턴스 만들수없음
    // 클래스 앞에 abstract 작성
//    Canids01 c = new Canids01();
    Canids01 d = a;
    Canids01 e = b;


    Canids01 f = new Chihuahua01();
    Canids01 g = new Wolf01();

}


// @formatter:off
// 개과
abstract class Canids01 {
}

// 치와와
class Chihuahua01 extends Canids01 {
}

// 늑대
class Wolf01 extends Canids01 {
}