package com.kh.hw.person.view;

import com.kh.hw.person.controller.PersonController;
import day13.static_.Count;

import java.util.Scanner;


import static com.kh.hw.person.controller.PersonController.COUNT_E;
import static com.kh.hw.person.controller.PersonController.COUNT_S;

public class PersonMenu {

   Scanner sc = new Scanner(System.in);
   PersonController pc = new PersonController();

   public void mainMenu() {

       System.out.printf("학생은 최대 %d명까지 저장할 수 있습니다.\n",COUNT_S);
       System.out.printf("현재 저장된 학생은 %d명입니다.\n", pc.personCount()[0]);
       System.out.printf("사원은 최대 %d명까지 저장할 수 있습니다.\n", COUNT_E);
       System.out.printf("현재 저장된 사원은 %d명입니다\n",  pc.personCount()[1]);
       System.out.println("1.학생 메뉴");
       System.out.println("2.사원 메뉴");
       System.out.println("9.끝내기");
       System.out.print("메뉴 번호 : ");
       int menu = sc.nextInt();
        switch (menu) {
            case 1:
                studentMenu();
                break;
            case 2:
                employeeMenu();
                break;
            case 9:

                break;
        }


   }

   public void studentMenu() {
       if (pc.personCount()[0] < COUNT_S) {
           System.out.println("1. 학생 추가");
       }
       System.out.println("2. 학생 보기");
       System.out.println("9. 메인으로");
       System.out.print("메뉴 번호 : ");
       int menu = sc.nextInt();

       switch (menu) {
           case 1:
               insertStudent();
               break;
           case 2:
               printStudent();
           case 9:

               return;
       }
    }

    public void employeeMenu() {

    }


    public void insertStudent() {
       String name = sc.next();
       int age = sc.nextInt();
       double height = sc.nextDouble();
       double weight = sc.nextDouble();
       int grade = sc.nextInt();
       String mager = sc.next();
        pc.insertStudent(name, age, height, weight, grade, mager);
    }

    public void printStudent() {

    }

    public void insertEmployee() {

    }

    public void printEmployee() {

    }


}//end class
