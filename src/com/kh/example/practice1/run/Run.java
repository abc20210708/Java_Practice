package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

    public static void main(String[] args) {

        Member member = new Member();
        member.changeName("김꼬깔");
        member.changeName("박삐리리");
        member.printName();

    }
}
