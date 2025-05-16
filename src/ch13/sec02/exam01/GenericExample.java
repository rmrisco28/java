package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        // k는 TV로 대체, M은 String 으로 대체
        Product<Tv, String> product1 = new Product<>();
        //Setter 매개값은 반드시 Tv와 String을 제공
        product1.setKind(new Tv());
        product1.setModel("스마트 Tv");

        // Getter 리턴값은 Tv와String이 됨
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();
        //----------------------------------------
        //k는 Car로 대체, M은 String 으로 대체
        Product<Car, String> product2 = new Product<>();

        // Setter 매개값은 반드시 Car와 String을 제공
        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        // Getter 리턴 값은 Car와 String 이 됨
        Car car = product2.getKind();
        String CarModel = product2.getModel();
    }
}
