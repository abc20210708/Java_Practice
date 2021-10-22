package day11.encap;

public class Driver {

    String name;//운전자 이름
    Car myCar; //자동차
    private boolean license; //면허 소지 여부

    //면허를 취득하는 기능
    public void getLicense() {
        if (!this.license) {
            this.license = true;
            System.out.println("면허를 취득했습니다.");
        } else {
            System.out.println("이미 면허를 소지중입니다.");
        }
    }

    //운전하는 기능
    public void drive() {
        if(!this.license) {
            System.out.println("면허를 먼저 취득하세요!");
            return;
        } else if (myCar == null) {
            System.out.println("차량을 먼저 구매하세요!");
            return;
        }

        System.out.println("운전을 시작합니다.");
        myCar.engineStart();
        myCar.setMode('D');
        myCar.accelerator();
    }

    //차량을 구매하는 기능
    public void buyCar(Dealer dealer, String carName) {
        this.myCar = dealer.sellCar(2000, carName);
        if (myCar != null) {
            System.out.printf("%s을 구매했습니다.",
                    myCar.getModel());
        } else {
            System.out.println("차량 구매에 실패했습니다.");
        }

    }








}//end class
