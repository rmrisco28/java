package ch13.lecture;

public class App07 {
    public static void main(String[] args) {
        Box07<Number> b1 = new Box07<>();
        // 타입을 Number로 선택했기 때문에 둘다 가능 한상황
        b1.setItem(3.14); // Double
        b1.setItem(99); // Integer

        Integer b = 3;
        Number a = b;

        Box07<Integer> b3 = new Box07<>();

/*        Box07<Number> b2 = b3; // x
        // 만약에 위 줄이 오류가 안난다고 감안하고 생각해본다면,
        b2.setItem(88);
        b2.setItem(3.14);
        // 위 두줄도 되야하는데, 안되기 때문에 에러.
        */

        //하지만 이런 상황을 사용하고싶을 때 쓰는 코드
        // ? " whildcard
        //Number의 하위 클래스일 때 사용 가능
        Box07<Integer> b5 = new Box07<Integer>();
        Box07<Double> b6 = new Box07<Double>();
        Box07<Number> b7 = new Box07<Number>();
        Box07<Object> b8 = new Box07<>();

        Box07<? extends Number> b4 = b3;
        b4 = b6;
        b4 = b7;
//        b4= b8;
        // 그래서 왜 쓰느냐?
        // b4가가르키고 있는 인스터스가 b5, b6, b7 까지도 될 수 있는데,
        // B4가 갖고있는 타입은 Number의 하위타입이기 때문에, Number가 갖고있는 내용들은
        // 안전하게 사용 할 수 있음.
        // Number 타입으로 안전하게 꺼낼 수 있다. (get)
        // 우리 입장에서는 꺼낸것처럼 보이지만,
        // box 입장에서는 생산했다고 표현함. (produce)
        Number item = b4.getItem();
        item.intValue();

        // 반대로 박스 입장에서 소비할때
        Box07<Number> b10 = new Box07<>();
        Box07<Object> b11 = new Box07<>();
        Box07<? super Number> b9;
        b9 = b10;
        b9 = b11;


        // 우리 입장에서는 안전하게 set 할수 있음
        // box 입장에서는 consume
        b9.setItem(9);
        b9.setItem(3.14);

        // ?
        Box07<Object> b13 = new Box07<>();
        Box07<Number> b14 = new Box07<>();
        Box07<Integer> b15 = new Box07<>();
        Box07<Double> b16 = new Box07<>();
        Box07<Boolean> b17 = new Box07<>();
        // 다 들어올 수 있으니 Object 타입
        Box07<?> b12;
        b12 = b13;
        b12 = b14;
        b12 = b15;
        b12 = b16;
        b12 = b17;

    }
}

class Box07<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
