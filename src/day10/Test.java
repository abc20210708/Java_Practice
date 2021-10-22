package day10;

////패키지 밑에 import 선언
//import day10.car.Avante;
//import day10.car.Santafe;

////car 패키지에 있는 모든 것
import day10.car.*;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        new day10.juice.Apple();
        //new Apple();


        //new day10.car.Avante();///패키지 경로 써줘야함

        ///import 사용하면 생략이 가능함
        new Avante();
        new Santafe();

        java.util.Scanner sc = new java.util.Scanner(System.in);


    }
}
