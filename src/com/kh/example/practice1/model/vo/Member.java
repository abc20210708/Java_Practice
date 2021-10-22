package com.kh.example.practice1.model.vo;

public class Member {

    private String memberId;
    private String memberPwd;
    private String memberName;
    private int age;
    private char gender;
    private String phone;
    private String email;

    //생성자
    public Member() {

    }


    //메소드
   public void changeName(String name) {
       this.memberName = name;
    }

    public void printName() {
        System.out.printf("이름: %s\n", this.memberName);
    }

}//end class
