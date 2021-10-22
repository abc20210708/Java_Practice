package day14.poly.car;

public class Sonata extends Car{

    @Override
    public void run() {
        System.out.println("소나타가 달립니다.");
    }

    @Override
    public void downSpeed() {

    }

    public void 국산세단할인() {
        System.out.println("소나타가 할인을 받았습니다.");
    }



/*
///Override을 하지 않고
    public void runS() {
        System.out.println("소나타가 달립니다.");
    }
    */

}//end class
