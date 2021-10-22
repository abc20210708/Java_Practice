package day12.inherit;

import day14.poly.casting.Parent;
import day14.poly.player.Main;

public class Warrior extends Player{


     public int rage;

     public Warrior() {
         // this("dd");
          //// super = Player 그래서 객체가 2개가 생성이 됨
          super();////생략되어 있음.////부모의 생성자 호출
          ///this()처럼
          System.out.println("Warrior 객체 생성됨!");
     }

     public Warrior(String name, int rage) {
          super(name);///부모의 생성자를 호출
          this.rage = 100;
     }

     public Warrior(String name) {
          super(name);

     }

     ////오버라이딩
     @Override
     public void info() {
          super.info();////직속부모 super
          System.out.println("# 분노: " + rage);
     }

    public void fireSlash(Player target) {

        System.out.printf("%s님이 %s님에게 FireSlash를 시전했습니다!\n"
                , this.name, target.name);
        int damage;
        String job;
        if (target instanceof Warrior) {
            damage = 10;
            job = "전사";
        } else if (target instanceof Mage) {
            damage = 20;
            job = "마법사";
        } else if (target instanceof Hunter) {
            damage = 15;
            job = "사냥꾼";
        } else {
            damage = 0;
            job = "미확인";
        }
        target.hp -= damage;
        System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n"
                , target.name, job, damage);
        System.out.printf("%s님의 현재 체력: %d\n"
                , target.name, target.hp);
        System.out.println();
    }



}//end class
