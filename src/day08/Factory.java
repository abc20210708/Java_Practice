package day08;

//실행용 클래스
public class Factory {

    public static void main(String[] args) {

        //객체의 생성
        Phone galaxy = new Phone();////생성자 호출
       // System.out.println("galaxy = " + galaxy);
        ///new 하고 설계도 이름()
        ////타입 이름 = 클래스 이름
        //galaxy.powerOn();

        //객체의 속성과 기능을 참조: 참조연산자 . 을 사용
        galaxy.powerOn();
        galaxy.showSpec();

        System.out.println("================");
        Phone iPhoneX = new Phone("아이폰X");


        iPhoneX.powerOn();
        iPhoneX.showSpec();

        System.out.println("================");

        Phone s21 = new Phone("갤럭시 노트 S21","에메랄드 그린");
        s21.powerOn();
        s21.showSpec();

        s21.ionBattery = new Battery("로켓");

        System.out.println("s21의 배터리 회사명 = " + s21.ionBattery.company);


        //아이폰x의 배터리를 충전
        iPhoneX.ionBattery.charge();


    }
}
