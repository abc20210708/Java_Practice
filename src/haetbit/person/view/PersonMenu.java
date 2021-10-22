package haetbit.person.view;

import haetbit.person.controller.PersonController;
import haetbit.person.model.vo.Employee;
import haetbit.person.model.vo.Student;

import java.util.Scanner;

import static com.kh.hw.person.controller.PersonController.COUNT_E;
import static com.kh.hw.person.controller.PersonController.COUNT_S;

public class PersonMenu {

   Scanner sc = new Scanner(System.in);
   PersonController pc = new PersonController();

   public void mainMenu() {

       while (true) {
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
                   System.out.println("종료합니다.");
                   return;
           }
       }//end while


   }

   public void studentMenu() {

       while (true) {

           System.out.println("1. 학생 추가");
           System.out.println("2. 학생 보기");
           System.out.println("9. 메인으로");

           int count = pc.personCount()[0];
           if(count == 3) {
               System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
           }

           System.out.print("메뉴 번호 : ");
           int menu = sc.nextInt();

           switch (menu) {
               case 1:
                   if(count == 3) {
                       System.out.println("잘못 입력하셨습니다. 다시 입력하세요!");
                   } else {
                       insertStudent();
                       break;
                   }

               case 2:
                   printStudent();
                   break;
               case 9:
                   System.out.println("메인으로 돌아갑니다.");
                   return;
               default:
                   System.out.println("잘못 입력함! 다시 입력하세욥");
           }//end case
       }//end while
   }

    public void employeeMenu() {
        while (true) {

            System.out.println("1. 사원 추가");
            System.out.println("2. 사원 보기");
            System.out.println("9. 메인으로");

            int count = pc.personCount()[1];
            if(count == 10) {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
            }

            System.out.print("메뉴 번호 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    if(count == 10) {
                        System.out.println("잘못 입력하셨습니다. 다시 입력하세요!");
                    } else {
                        insertEmployee();
                        break;
                    }

                case 2:
                    printEmployee();
                    break;
                case 9:
                    System.out.println("메인으로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 입력함! 다시 입력하세욥");
            }//end case
        }//end while
    }


    public void insertStudent() {

        while (true) {
            System.out.print("학생 이름 : ");
            String name = sc.next();
            System.out.print("학생 나이 : ");
            int age = sc.nextInt();
            System.out.print("학생 키 : ");
            double height = sc.nextDouble();
            System.out.print("학생 몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("학생 학년 : ");
            int grade = sc.nextInt();
            System.out.print("학생 전공 : ");
            sc.nextLine();
            String major = sc.nextLine();
            pc.insertStudent(name, age, height, weight, grade, major);

            int count = pc.personCount()[0];
            if(count != 3) {
                System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
                String select = sc.nextLine();
                if (select.equals("n")|| select.equals("N") || select.equals("ㅜ")) {
                    return;
                }
            } else {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기  때문에 학생 추가를 종료하고\n" +
                        "학생 메뉴로 돌아갑니다");
                return;
            }
        }//end while
    }

    public void printStudent() {
        Student[] s = pc.printStudent();

        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                System.out.println(s[i]);
            }
        }

    }

    public void insertEmployee() {
        while (true) {
            System.out.print("사원 이름 : ");
            String name = sc.next();
            System.out.print("사원 나이 : ");
            int age = sc.nextInt();
            System.out.print("사원 키 : ");
            double height = sc.nextDouble();
            System.out.print("사원 몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("사원 급여 : ");
            int salary = sc.nextInt();
            System.out.print("사원 부서 : ");
            sc.nextLine();
            String major = sc.nextLine();
            pc.insertStudent(name, age, height, weight, salary, major);

            int count = pc.personCount()[1];
            if(count != 10) {
                System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
                String select = sc.nextLine();
                if (select.equals("n")|| select.equals("N") || select.equals("ㅜ")) {
                    return;
                }
            } else {
                System.out.println("사원을 담을 수 있는 공간이 꽉 찼기  때문에 학생 추가를 종료하고\n" +
                        "사원 메뉴로 돌아갑니다");
                return;
            }
        }//end while
    }

    public void printEmployee() {
        Employee[] e = pc.printEmployee();
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null) {
                System.out.println(e[i]);
            }
        }
    }


}//end class
