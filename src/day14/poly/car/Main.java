package day14.poly.car;

import com.kh.hw.person.model.vo.Student;
import day10.modi.pac1.B;

public class Main {

    public static void main(String[] args) {

        Tucson t = new Tucson();
        Sonata s = new Sonata();
        Boxster b = new Boxster();

        ////int가 double에 들어가듯이
        ////하위객체가 들어감

        //주행 테스트
        //t.run(); s.run(); b.run();
        Car[] cars = {t, s, b, new Tucson(), new Boxster()};

        for (Car c : cars) {
            c.run();
        }

        System.out.println("================");
        Driver park = new Driver();
        park.drive(s);
        park.drive(new Tucson());
        park.drive(new Boxster());

        System.out.println(new Sonata());

        System.out.println("==================");
         Car myCar = park.buyCar("소나타");
         myCar.run();

         park.buyCar("박스터").run();

         //int a = 10;
         //double d = a;

        // Sonata sn = new Sonata();
        // Car cc = sn;

//        double dd = 3.5;
//        int vv = (int)dd;
//
//        Sonata ss = new Sonata();
//        Car cc = ss;
//        Sonata sss = (Sonata)cc;


        System.out.println("==================");
        //Car 내소나타 = park.buyCar("소나타");
        Sonata 내소나타 =  (Sonata)park.buyCar("소나타");
        ////일일히 캐스팅이 아니고 받을 때부터 캐스팅
        //((Sonata) 내소나타).국산세단할인();
        내소나타.국산세단할인();
        내소나타.run();

        cars[0] = 내소나타;

        System.out.println("==================");

        Boxster 내박스터 = (Boxster)park.buyCar("박스터");
        내박스터.스포츠카할증();

        Car car = new Sonata(); //new Car();
        //Sonata sss = (Sonata)Car;
       // sss.국산세단할인();
        //car.국산세단할인();

        System.out.println("==================");
        CarShop shop = new CarShop();
        int money = shop.sellCar(new Boxster());
        System.out.println("money = " + money);


        
        


    }//end main
}//end class
