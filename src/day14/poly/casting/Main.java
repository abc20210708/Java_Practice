package day14.poly.casting;

import day10.modi.pac2.C;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2();

        System.out.println("=============");
        Child child = new Child();
        child.m1();
        child.m2();
        child.m3();

        System.out.println("===============");

        Parent upChild = new Child();
        System.out.println(upChild);
        upChild.m2();
        ((Child)upChild).m3();//다운캐스팅.잠깐 내려감


    }//end main
}//end class
