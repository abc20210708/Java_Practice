package day15.abs;

import day12.protec.pac2.D;

public class Main {
    public static void main(String[] args) {

        Pet[] pets = {
                new Dog("뽀삐", "진돗개"),
                new Cat("말썽쟁이", "러시안블루"),
                new Tiger("호돌이","시베리아 호랑이")
        };

        for (Pet pet : pets) {
            System.out.println("=======");
            pet.inject();
            pet.eat();
        }

        ////new Pet(); (X) ////타입으로는 쓸 수 있음!
        Pet t = new Tiger("호랭이", "백두산 호랑이");
    }//end main
}//end class
