package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {

    private int[] lotto;

    public Lotto() {
        lotto = new int[6];

        /*
        int successCnt = 0; //로또번호를 잘 저장했을 때 증가
        while (successCnt < lotto.length) {
            int rn = (int) (Math.random() * 45 + 1);
            boolean flag = false; //중복을 판단하는 변수
            for (int i = 0; i < successCnt; i++) {
                if (rn == lotto[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                lotto[successCnt++] = rn;
            }
        }
    */
        for (int i = 0; i < lotto.length; i++) {
            int rn = (int) (Math.random() * 45 + 1);
            lotto[i] = rn;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

    }

    public void information() {
        System.out.println("로또번호: " + Arrays.toString(lotto));
    }
}//end class
