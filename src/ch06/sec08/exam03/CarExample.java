package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar = new Car();


        // 리턴 값이 없는 seetGas()메소드 호출
        myCar.setGas(5);
        if (myCar.isLeftgas()) {
            System.out.println("출발합니다.");
            //return 값이 없는 run 메소드 호출
            myCar.run();
        }

        System.out.println("gas를 주입하세요");
    }
}
