package day08;


public class Battery {

    String company;
    int price;
    int amount; //용량

    Battery(String companyName) {

        company = companyName;
    }

    void charge() {
        System.out.println("배터리를 충전합니다.");
    }
}
