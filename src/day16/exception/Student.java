package day16.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {

    private Scanner sc = new Scanner(System.in);

    private String name; //이름
    private double score;//시험점수

    //생성자
    public Student(String name) {
        this.name = name;
    }

    //이름을 변경하는 기능
    public void changeName() {
        System.out.print("새로운 이름 : ");
        this.name =  sc.nextLine();
    }
    //점수를 입력하는 기능
    public void insertScore() throws InputMismatchException {
        System.out.print("점수: ");
        this.score = sc.nextInt();
    }
    //평균을 출력하는 기능
    public void printAvg() throws InputMismatchException, ArithmeticException {
        System.out.print("과목수: ");
        int subjectCnt = sc.nextInt();
        System.out.println(score / subjectCnt);
    }


}//end class
