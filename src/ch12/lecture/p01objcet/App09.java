package ch12.lecture.p01objcet;

public class App09 {
    public static void main(String[] args) {
        Car09 c1 = new Car09("tesla", 7000);
        Car09 c2 = new Car09("genesis", 6000);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        // 밑에 toString을 정의 해놓으면 아래처럼 그냥 변수명만 써도 toString 값이나옴
        System.out.println(c1);
        System.out.println(c2);


    }
}

class Car09 {
    private String model;
    private int pirce;

    public Car09(String model, int pirce) {
        this.model = model;
        this.pirce = pirce;
    }

    @Override
    public String toString() {
        return "Car09{" +
                "model='" + model + '\'' +
                ", pirce=" + pirce +
                '}';
    }
}
