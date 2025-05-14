package ch07.sec03.exam02;

public class Phone {
    // 필드 선언
    private String model;
    private String color;


    // 매개 변수를 갖는생성자 선언
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자 실행");


    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

}
