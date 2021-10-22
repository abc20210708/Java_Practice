package day06;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Roulette {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int playerNum = 2;
        while (true) {
            System.out.print("게임 인원 (2 ~ 4명) ==> ");
            try {
                playerNum = sc.nextInt();
                if (playerNum < 2 || playerNum > 4) {
                    System.out.println("인원수가 올바르지 않습니다.");
                }//end if
                else {
                    break;
                }
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("숫자 2, 3, 4 중 하나를 입력해주세요 :)");
            }

        }//end while

        System.out.println("\n플레이어 이름을 등록합니다.");


        //플레이어의 이름들을 저장할 배열
        String[] players = new String[playerNum];
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d번 플레이어 이름: ", i+1);
            String name = sc.next();
            players[i] = name;
        }//end for
        System.out.println(Arrays.toString(players) + " 참가! ");


        int bulletNum = 0;
        while (true) {
            try {
                System.out.print("\n실탄 개수 (6 미만) ===> ");
                bulletNum = sc.nextInt();
                sc.nextLine();//Int,next,double 쓸 때 습관적으로
                break;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("6미만의 정수만 입력하세요!!!");
            }
        }

        //탄창 배열을 생성
        boolean[] magazine = new boolean[6];
        //정확하게 총알을 세팅한 횟수
        int successCount = 0;
        while (successCount < bulletNum) {
            //랜덤 정수 0~5 생성
            int position = (int) (Math.random() * magazine.length);
            if(magazine[position]==false) { //탄창이 비어있다면 //!magazine[position]
                magazine[position] = true;//장전해라
                successCount++;
            }//end if
           // if(successCount == bulletNum) break;
        }//end while1

        System.out.println(Arrays.toString(magazine));

        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");

        //=================게임 시작 로직===================/
        //선턴 플레이어는 랜덤 결정, 결정된 이후에는 돌아가면서 발포
        int turn = (int) (Math.random() * playerNum);
        System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n", players[turn]);
        /*
            #한 턴 동안 벌어질 일들
            1. 탄창의 발포위치를 랜덤으로 재조정한다.
            2. 해당 위치에서 격발: 랜덤 인덱스 위치 값이 true인지 확인
            3. true에서 발포되었으면 사망판정, false였으면 다음 턴으로 넘김
        */


        System.out.println("# 엔터를 누르면 시작!");
        sc.nextLine();

        while (true) {
            System.out.printf("[%s의 턴]\t탄착을 무작위로 돌립니다.\n",players[turn]);
            int bulletPos = (int)(Math.random() * magazine.length);

            System.out.println("# 엔터를 누르면 격발합니다.");
            sc.nextLine();

            if(magazine[bulletPos]) {//true면
                System.out.printf("\n빵 [%s]님 사망....\n", players[turn]);
                break;
            } else {//false면
                //생존한 경우: 턴을 넘겨
                System.out.println("휴,,, 살았습니다.");

                //만약 현재 턴이 마지막 플레이어라면 다음 턴은 0번으로 조정
                if(turn == players.length-1) {
                   turn = 0;
                }
                //그게 아니면 다음 턴은 1 증가 시킴
                else {
                    turn++;
                }
            }//end else


        }//end while











    }
}
