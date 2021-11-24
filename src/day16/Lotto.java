package day16;

import java.util.Arrays;
import java.util.Random;
import day16.LottoSimulator;


public class Lotto {

    static Random r = new Random();

    public static void main(String[] args) {
        /* <로또 번호 출력하기>
         * 1. 로또 번호 6개를 담을 배열을 생성하세요.
         * 2. 정수 1~45 범위의 난수를 6개 발생시켜 배열에 담으세요.
         * 3. 중복숫자를 배제하세요.
         * 4. 배열을 오름차순으로 정돈하고 출력하세요.
         */
        int[] win = createLotto();
        System.out.println("*** 당첨 로또 번호 ***");
        System.out.println(Arrays.toString(win));

        int bonus = createBonusNum(win);
        System.out.println("보너스 번호: " + bonus + "번");


        int[] myLotto = createLotto();
        System.out.println("*** 내가 산 로또 번호 ***");
        System.out.println(Arrays.toString(myLotto));

        checkLottoNumber(win, myLotto);
    }

    public static int[] createLotto() {
        int[] lotto = new int[6];
        int i = 0;
        while(i < lotto.length) {
            boolean flag = false;
            int rn = r.nextInt(45) + 1;
            for(int j=0; j<i; j++)
                if(rn == lotto[j]) {
                    flag = true;
                    break;
                }
            if (!flag) {
                lotto[i] = rn;
                i++;
            }
        }
        Arrays.sort(lotto);
        return lotto;
    }

    //보너스 번호를 생성하는 메서드.
    public static int createBonusNum(int[] win) {

        int bonus = 0;
        while(true) {
            int rn = r.nextInt(45) + 1;
            boolean flag = false;
            for(int num : win)
                if(rn == num) {
                    flag = true;
                    break;//break for
                }
            if(!flag) {
                bonus = rn;
                break;//break while
            }
        }
        return bonus;

    }

    //로또 번호를 몇개 맞췄는지 확인하는 메서드
    static void checkLottoNumber(int[] win, int[] myLotto) {
        int count = 0;

        //번호일치 여부확인 로직
        for(int i : myLotto) {
            for(int j : win) {
                if(i == j) {
                    count++;
                    break;
                }
            }
        }

        if(count == 6) {
            System.out.println("숫자가 6개 일치함.");
        } else if(count == 5) {
            System.out.println("숫자가 5개 일치함.");
        } else if(count == 4) {
            System.out.println("숫자가 4개 일치함.");
        } else if(count == 3) {
            System.out.println("숫자가 3개 일치함.");
        } else if(count == 2) {
            System.out.println("숫자가 2개 일치함.");
        } else if(count == 1) {
            System.out.println("숫자가 1개 일치함.");
        } else {
            System.out.println("꽝이야~~~");
        }

    }
}//end class
