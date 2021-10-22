package day10.player;

public class Main {

    public static void main(String[] args) {

        Player park = new Player("주차왕파킹");
        Player show = new Player("공연왕쇼킹");

        System.out.println("show = " + show);
        System.out.println("park = " + park);
        park.attack(show);

        System.out.println("============");
        Player noname = new Player();
        noname.info();


    }
}
