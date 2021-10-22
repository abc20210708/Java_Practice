package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.LibraryController;

import java.util.Scanner;

public class LibraryMenu {

   private LibraryController lc  = new LibraryController();
   private Scanner sc = new Scanner(System.in);

   public void mainMenu() {
       while (true) {
           System.out.println("==== 메뉴 ====");
           System.out.println("1. 마이페이지");
           System.out.println("2. 도서 전체 조회");
           System.out.println("3. 도서 검색");
           System.out.println("4. 도서 대여하기");
           System.out.println("9. 프로그램 종료하기");
           System.out.print("메뉴 번호 : ");
           int menu = sc.nextInt();

           switch (menu) {
               case 1:
                   lc.myInfo();
                   break;
               case 2:
                   lc.selectAll();
                   break;
               case 3:
                   //lc.searchBook();
                   break;
               case 4:
                   //lc.rentBook();
                   break;
               case 9:



           }

       }


   }

   public void selectAll() {

   }

   public void searchBook() {

   }

   public void rentBook() {

   }

}//end class
