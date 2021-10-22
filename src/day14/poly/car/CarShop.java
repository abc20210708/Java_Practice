package day14.poly.car;

public class CarShop {

    ///상위타입으로 들어온 객체 확인
    public int sellCar(Car car) {
        if (car instanceof Sonata) {
            ///왼쪽에는 변수 //오른쪽에는 데이터 타입
            return 2000;
        } else if(car instanceof Tucson) {
            return 2400;
        } else if(car instanceof Boxster) {
            return 7000;
        }
        return 0;
    }
}//end class
