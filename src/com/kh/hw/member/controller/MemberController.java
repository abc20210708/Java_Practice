package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;
import com.kh.practice.student.model.vo.Student;

import java.util.Scanner;

public class MemberController {

    private Member[] m = new Member[SIZE];

    public static final int SIZE = 10;

    public MemberController() {
        m[0] = new Member("abc","김철수","aa","aa@aaa.aaa",'F',33);
        m[1] = new Member("bbbbb ","박영희","bb","bbb@bbb.bbb",'M',34);
        m[2] = new Member("ghi","김철수","cc","ccc@ccc.ccc",'M',28);

    }


    /*
    * 실제로 배열에 저장된 회원객체의 숫자를 세는 메서드
    * @return count - 실제 회원의 저장 숫자
    * */
    public int existMemberNum() {
        int count = 0;//숫자를 세는 변수
        for (Member member : m) {
            if(member == null) break;
            count++;
        }
        return count;
    }

    /*
    *  아이디 중복을 확인하는 메서드
    *  @param inputId - 중복을 확인할 사용자의 입력 아이디
    *  @return 중복이 되었으면 true, 안되었으면 false
    * */

    public boolean checkId(String inputId) {

        for (Member member : m) {
            if(member == null) break;
            if(inputId.equals(member.getId())) {
                return true; //중복됨
            }//end if
        }//end for
        return false; //중복안됨
    }

    //Member 객체를 객체배열에 저장하는 메서드
    public void insertMember(String id, String name, String password, String email, char gender, int age) {
        int count = existMemberNum();
        m[count] = new Member(id, name, password, email, gender, age);
    }

    //아이디를 입력하면 해당 회원의 정보를 반환
    public Member searchId(String id) {

        for (Member member : m) {
            if(member == null) break;
            if (id.equals(member.getId())) {
               return member;
            }
        }//end for
        return null;
    }

    //이름을 입력하면 그 이름에 해당하는 모든 회원정보 return
    ////모든 홍길동을 찾아주세요
    public Member[] searchName(String name) {

        //이름이 매칭된 회원들을 저장할 배열

        Member[] foundMembers = new Member[0];
        for (Member member : m) {
            if(member == null) break;
            if (name.equals(member.getName())) {
              // foundMembers[] = member;
               foundMembers = pushMember(foundMembers,member);
            }
        }//end for
        return foundMembers;
    }

    //멤버 배열 맨 끝에 데이터를 추가하는 메서드
    private Member[] pushMember(Member[] targets, Member newMember) {
        Member[] newArr = new Member[targets.length + 1];
        for (int i = 0; i < targets.length; i++) {
            newArr[i] = targets[i];
        }
        newArr[targets.length] = newMember;
        return newArr;
    }

    public Member searchEmail(String email) {
        for (Member member : m) {
            if(member == null) break;
            if(email.equals(member.getEmail())) {
                return member;
            }
        }
        return null;
    }


    /*//비밀번호 변경 메서드
    * @param id 변경을 원하는 회원의 아이디
    * @param password 새로운 비밀번호
    * @return 변경 성공 여부 - 성공시 true, 실패시 false
    * */

    public boolean updatePassword(String id, String password) {

        Member member = searchId(id);
            if(member != null) {
                member.setPassword(password);
                return true;
            } else {
                return false;
        }
    }

    //이름 변경 메서드
    public boolean updateName(String id, String name) {
        Member member = searchId(id);
        if(member != null) {
            member.setName(name);
            return true;
        } else {
            return false;
        }
    }

    //이메일 변경 메서드
    public boolean updateEmail(String id, String email) {
        Member member = searchId(id);
        if(member != null) {
            member.setEmail(email);
            return true;
        } else {
            return false;
        }
    }

    //회원정보 한 명을 삭제하는 메서드
    public boolean delete(String id) {
        int delIdx = -1; //삭제 대상 인덱스
        //삭제 대상 인덱스 탐색
        int count = existMemberNum();
        for (int i = 0; i < count; i++) {
            if(id.equals(m[i].getId())) {
                delIdx = i;
                break;
            }
        }//end for
        //삭제 알고리즘
        if(delIdx != -1) {
            for (int i = delIdx; i < count -1; i++) {
                m[i] = m[i+1];
            }
            //마지막 데이터 null로 변경
            m[count -1] = null;
            return true;
        }
        //return true 만나지 못함! 삭제 실패!
        return false;
    }

    // 회원정보 전체 삭제
    ///방을 없애는 것이 아니고 안에 있는 데이터
    ////existMemberNum 처음엔 3이였는데
    ////m[0] = null이라서
    ////0번 인덱스가 나와서 break;
    ///반복문 돌리 때 다시 콜
    ////변수를 사전에 담고 , 콜은 한번만 하고고
   public void delete() {
        int count = existMemberNum();
        for (int i = 0; i < count; i++) {
            m[i] = null;
        }
    }

    // Member 객체 반환 메소드
    public Member[] printAll() {
        return m;
    }



}//end class
