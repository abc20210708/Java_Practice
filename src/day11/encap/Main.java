package day11.encap;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.engineStart();
        car.accelerator();
        //car.speed = -500;

        //car.slowdown();
        //car.startFlag = false;
        //car.mode = 'D';
        car.setMode('Z');
        car.accelerator();

//        System.out.printf("지금 주행 속도는 %dkm/h입니다\n",
//                car.speed);//변경도 참조도 막힘

        System.out.printf("지금 주행 속도는 %dkm/h입니다\n",
                car.getSpeed());//변경도 참조도 막힘

        System.out.println("======================");
        Driver kim = new Driver();
        Dealer park = new Dealer("박뽀로로");
        Dealer lee = new Dealer("이초코송이");

        kim.getLicense();
        kim.buyCar(park, "포르쉐911");

        //kim.drive();

    }//end main
}//end class
