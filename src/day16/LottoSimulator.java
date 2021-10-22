package day16;

import day16.Lotto;

public class LottoSimulator {
    static int prize1 = 0; //1등 당첨횟수를 저장할 변수.
    static int prize2 = 0; //2등 당첨횟수를 저장할 변수.
    static int prize3 = 0; //3등 당첨횟수를 저장할 변수.
    static int prize4 = 0; //4등 당첨횟수를 저장할 변수.
    static int prize5 = 0; //5등 당첨횟수를 저장할 변수.
    static int failCnt = 0;//꽝 당첨횟수를 저장할 변수.



    static void checkLottoNumber(int[] win, int[] lotto, int bonus) {
        int cnt = 0;

        for(int i : lotto) {
            for(int j : win) {
                if(i == j) {
                    cnt++;
                    break;
                }
            }
        }
        if(cnt == 6) {
            prize1++;
        } else if(cnt == 5) {
            boolean flag = false;
            for(int n : lotto) {
                if(bonus == n) {
                    prize2++;
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                prize3++;
            }
        } else if(cnt == 4) {
            prize4++;
        } else if(cnt == 3) {
            prize5++;
        }  else {
            failCnt++;
        }
    }

    public static void main(String[] args) {

        int[] win = Lotto.createLotto(); //당첨번호 배열
        int bonus = Lotto.createBonusNum(win); //보너스 번호
        int paper = 0; //로또 구매 횟수
        while(true) {
            int[] myLotto = Lotto.createLotto();
            paper++;
            checkLottoNumber(win, myLotto, bonus);

            if(prize1 == 1) {
                System.out.println("\n# 1등에 당첨되었습니다.");
                System.out.println("# 1등에 1번 당첨될때까지 누적 당첨현황...");
                System.out.printf("# 1등 당첨횟수(%.8f%%): %d회\n", (prize1/(double)paper)*100, prize1);
                System.out.printf("# 2등 당첨횟수(%.8f%%): %d회\n", (prize2/(double)paper)*100, prize2);
                System.out.printf("# 3등 당첨횟수(%.8f%%): %d회\n", (prize3/(double)paper)*100, prize3);
                System.out.printf("# 4등 당첨횟수(%.8f%%): %d회\n", (prize4/(double)paper)*100, prize4);
                System.out.printf("# 5등 당첨횟수(%.8f%%): %d회\n", (prize5/(double)paper)*100, prize5);
                System.out.printf("# 꽝 당첨 횟수(%.8f%%): %d회\n", (failCnt/(double)paper)*100, failCnt);
                break;
            }else {
                System.out.printf("로또 %d장째 구입중...\n", paper);
            }
        }

    }


}
