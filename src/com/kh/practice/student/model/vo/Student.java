package com.kh.practice.student.model.vo;

public class Student {

    private String name;//이름
    private String subject;//과목
    private int score;//점수

    public Student() {
    }

    public Student(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //학생 필드 정보를 합쳐서 반환
    public String inform() {
        //단순히 출력이면 printf
        //만들어서 가져다 주는 것은 String.format()
        //return null;//null로 기본값
        //return "이름: " + this.name +"/ 과목: " + this.subject + "/ 점수: " + this.score;
        return String.format("이름: %s / 과목: %s / 점수: %d",
                this.name, this.subject, this.score);
    }

}//end class
