package day11.encap;

public class Dealer {

    private String name;

    public Dealer(String name) {
        this.name = name;
    }

    //차를 파는 기능
    public Car sellCar(int money, String carName) {
        if(money < 1000) {
            System.out.println("나 차 안팔아!!!!");
            return null;
        }
        Car car = new Car(carName);
        System.out.printf("%s 딜러가 %s 차량을 판매합니다.\n",
                this.name, car.getModel());
        return car;
    }


}//end class
