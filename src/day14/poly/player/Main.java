package day14.poly.player;

import day12.inherit.Hunter;
import day12.inherit.Mage;
import day12.inherit.Warrior;

public class Main {

    public static void main(String[] args) {

        Warrior powerMan = new Warrior("짱짱센전사");

        powerMan.fireSlash(new Mage("불쌍한마법사"));


        System.out.println("====================");

        powerMan.fireSlash(new Hunter("수상한 밀렵꾼", "살쾡이"));

        System.out.println("====================");

        powerMan.fireSlash(new Warrior("주차왕파킹"));




    }//end main
}//end class
