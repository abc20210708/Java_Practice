package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

    public static void main(String[] args) {

        //ctrl+p new Student();
        Student student = new Student(3,2,"유재석",177.7,'남');
        student.information();


    }//end main

}//end class
