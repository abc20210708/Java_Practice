package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;
import com.kh.practice.student.model.vo.Student;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static com.kh.hw.member.controller.MemberController.SIZE;

public class MemberMenu {

  private Scanner sc =  new Scanner(System.in);

  private MemberController mc = new MemberController();

    public MemberMenu() {

    }

    //메인 메뉴 출력 메소드
    public void mainMenu() {

        while (true) {
          System.out.printf("# 최대 등록 가능한 회원 수는 %d명 입니다.\n", SIZE);
          int regCount = mc.existMemberNum();

          System.out.printf("# 현재 등록된 회원 수는 %d명 입니다.\n", regCount);

          System.out.println("====================");

          //mc.size Alt + Enter
          if (regCount < SIZE) {
            System.out.println("#1. 새 회원 등록");
          }
          System.out.println("#2. 회원 검색");
          System.out.println("#3. 회원 정보 수정");
          System.out.println("#4. 회원 식제");
          System.out.println("#5. 모든 출력");
          System.out.println("#9. 끝내기");
          System.out.print("\n # 메뉴 번호 : ");
          int menu = sc.nextInt();

          switch (menu) {
            case 1:
              if (regCount < SIZE) {
                insertMember();
              } else {
                System.out.println("# 사용자를 추가할 수 없습니다.");
              }
              break;
            case 2:
              searchMember();
              break;
            case 3:
              break;
            case 4:
              deleteMember();
              break;
            case 5:
              printAll();
              break;
            case 9:
              System.out.println("프로그램을 종료합니다.");
              System.exit(0);//프로그램 정상 종료 메서드
            default:
              System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
          }//end switch


        }//end while
    }

      //2번 입력메뉴
      private void searchMember() {

          while (true) {
            System.out.println("\n# 검색을 시작합니다.");
            System.out.println("===================");
            System.out.println("1. 아이디로 검색하기");
            System.out.println("2. 이름으로 검색하기");
            System.out.println("3. 이메일로 검색하기");
            System.out.println("9. 메인으로 돌아가기");
            System.out.print("# 메뉴 입력: ");
            int menu = sc.nextInt();

            switch (menu) {
              case 1 :
                searchById();
                break;
              case 2 :
                searchByName();
                break;
              case 3 :
                searchByEmail();
                break;
              case 9 :
                System.out.println("# 메인메뉴로 돌아갑니다.");
                return;//함수를 종료
            }//end switch

          }//end while
      }

  //1번 입력메뉴
    public void insertMember() {
      System.out.println("\n#새 회원을 등록합니다.");
      ////id 죽으면 안 됨
      String id = null;
      while (true) {
        System.out.print("- 아이디: ");
        id = sc.next();

        //boolean flag = mc.checkId(id);
        //if 안에 ctrl + Alt + n 들어감
        //if 안에 ctrl + Alt + v 빠짐
        if(mc.checkId(id)) { //true면 중복
          System.out.println("# 중복된 아이디입니다. 다시 입력해주세요");
          continue;
        } else {
          break;
        }
      }

      System.out.print("- 이름: ");
      String name = sc.next();
      System.out.print("- 비밀번호: ");
      String pw = sc.next();
      System.out.print("- 이메일: ");
      String email = sc.next();

      char gender = checkGender();

      //ctrl + Alt + m
      int age = checkAge();

      //저장하는 거 시키기
      mc.insertMember(id,name, pw, email, gender, age);

    }

    private int checkAge() {
      int age = 0;
      while (true) {
        System.out.print("- 나이: ");
        age = sc.nextInt();
        if(age > 0 && age <=100) {
          break;
        } else {
          System.out.println("\n# 나이를 제대로 입력하세요");
        }
      }//end while
      return age;
    }

  //성별 값을 검증하는 메서드
    private char checkGender() {
      //toLowerCase() 소문자 변환
      char gender = 0;
      while (true) {
        System.out.print("- 성별(M/F): ");
        gender = sc.next().toLowerCase().charAt(0);
        if(gender == 'm' ||  gender == 'f') {
          return  gender;
        } else {
          System.out.println("\n# 성별을 다시 입력하세요.");
        }
      }//end while
    }

    // 2-1 번 입력메뉴
    public void searchById() {
      String inputId = inputSearchData("ID");

      Member member = mc.searchId(inputId);
      if(member != null) {
        //찾으면
        System.out.println("\n=====조회 결과=====");
        System.out.println(member.inform());
      } else {
        //못찾으면
        System.out.printf("# %s님은 등록된 회원이 아닙니다.\n", inputId);
      }
    }

  // 2-2 번 입력메뉴
    public void searchByName() {
      String inputName = inputSearchData("이름");

      Member[] members = mc.searchName(inputName);
      if(members.length > 0) {
        System.out.println("========== 조회 결과 =========");
        for (Member m : members) {
          System.out.println(m.inform());
        }
      } else {
        System.out.printf("%s님은 존재하지 않습니다.\n", inputName);
      }

    }

    //2-3번 입력메뉴
    public void searchByEmail() {
      String inputEmail = inputSearchData("이메일");
      Member member = mc.searchEmail(inputEmail);
      if(member != null) {
        //찾으면
        System.out.println("\n=====조회 결과=====");
        System.out.println(member.inform());
      } else {
        //못찾으면
        System.out.printf("# %s: 등록된 이메일이 아닙니다.\n", inputEmail);
      }
    }

    private  String  inputSearchData(String kind) {
      System.out.println("===============");
      System.out.printf("검색할 회원의 %s : ", kind);
      return sc.next();//입력커서 만들고 입력 받은 것 리턴
      //String data = sc.next();
      //return data;

    }

        //4번 메뉴
        public void deleteMember() {
          while (true) {
            System.out.println("\n# 회원 정보 삭제");
            System.out.println("# 1. 특정 회원 삭제");
            System.out.println("# 2. 전체 회원 삭제");
            System.out.println("# 9. 메인으로 돌아가기");
            System.out.print("- 메뉴 입력 : ");
            int menu = sc.nextInt();

            switch (menu) {
              case 1:
                deleteOne();
                break;
              case 2:
                deleteAll();
                //return;
              case 9:
                System.out.println("# 메인으로 돌아갑니다.");
                return;
            }//end switch
          }//end while


        }

      //4-1번 메뉴
      public void deleteOne() {
        System.out.println("\n# 삭제할 회원의 ID: ");
        String delId = sc.next();

        ////mc.searchId(delId).getName(); -- null이면 에러

        Member member = mc.searchId(delId);
        String name = "";
        if(member != null) {
          name = member.getName();
        }

        boolean delFlag = mc.delete(delId);
        if (delFlag) {
          System.out.printf("# %s님의 정보삭제가 완료되었습니다.", name);

        } else {
          System.out.printf("%s님은 존재하지 않습니다.\n", delId );
        }

      }
      //4-2번 메뉴
      public void deleteAll() {
        System.out.println("\n# 전체 회원을 삭제합니다. [y/n]");
        String check = sc.next();
        switch (check) {
          case "Y": case "y":  case "ㅛ":
            mc.delete();
            break;
          case "N": case "n" : case "ㅜ":
            System.out.println("# 삭제를 취소합니다.");
        }//end switch

      }



  //5번 입력 메뉴 : 전체 출력
      public void printAll() {
        Member[] members = mc.printAll();
        int count = mc.existMemberNum();
        if(count <= 0) {
          System.out.println("\n# 아직 한 명도 등록되지 않았습니다. 회원 등록 먼저 수행하세요!");
        } else {
          System.out.println("==== 전체 회원 정보 ====");
          for (int i = 0; i < count; i++) {
            System.out.println(members[i].inform());
          }
//          for (Member m : members) {
//            if(m == null) break;
//            System.out.println(m.inform());
//          }
        }
      }

    public void updateMember() {

    }

    public void updatePassword() {

    }

    public void updateName() {

    }

    public void updateEmail() {

    }











}//end class

