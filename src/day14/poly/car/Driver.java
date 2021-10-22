package day14.poly.car;

import day10.modi.pac1.B;

public class Driver {

    public Car buyCar(String carName) {
        if (carName.equals("소나타")) {
            System.out.println("소나타를 구매합니다.");
            return new Sonata();
        } else if (carName.equals("투싼")) {
            System.out.println("투싼을 구매합니다.");
            return new Tucson();
        } else if (carName.equals("박스터")) {
            System.out.println("박스터를 구매합니다.");
            return new Boxster();
        } else {
            System.out.println("없는 차량입니다.");
            return null;//모든 참조 타입의 기본값
        }
    }

    public void drive(Car c) {
        System.out.println("운전을 시작합니다.");
        c.run();
    }

    public void drive(Sonata s) {
        System.out.println("운전을 시작합니다.");
        s.run();
    }

    public void drive(Tucson t) {
        System.out.println("운전을 시작합니다.");
        t.run();
    }

    public void drive(Sonata ssss, Boxster b) {

    }

    public int drive(Tucson t, Sonata s) {
        return 0;
    }


}//end class
