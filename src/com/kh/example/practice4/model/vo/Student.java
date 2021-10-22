package com.kh.example.practice4.model.vo;

public class Student {

    //필드
    public int grade;
    public int classroom;
    public String name;
    public double height;
    public char gender;

    //생성자
    public Student(int grade,int classroom,String name,double height,char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
        //alt+ Insert 생성자 - ctrl + A
        //선택안함은 기본 생성자!

    }

    //메소드
    public void information() {
        System.out.printf("학년: %d학년\n", grade);
        System.out.printf("반: %d반\n", classroom);
        System.out.printf("이름: %s\n", name);
        System.out.printf("키: %.2fcm\n", height);
        System.out.printf("성별: %c\n", gender);
        //char-> %c
    }

}//end class
