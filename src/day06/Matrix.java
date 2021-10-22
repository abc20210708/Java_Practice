package day06;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        int[][] scores = {
                {80, 90, 85, 95},//1차원 나열
                {90, 60, 75, 85},
                {85, 90, 85, 55}

        };
        System.out.println("scores.length = " + scores.length);
        System.out.println(scores[0][1]);
        System.out.println(Arrays.toString(scores[1]));
        System.out.println(scores[1]);//주소저장

        scores[2][1] = 40;//int

        //// 값 수정
        scores[0] = new int[] {100,100,100,100}; //int []

        for (int[] arr : scores) {
            for ( int n : arr) {
                System.out.print(n + " ");
            }//end for
            System.out.println();//단순 줄개행
        }//end for

        //배열 생성문으로 2차원 배열 만들기
        //3행 5열짜리 배열
        System.out.println("===============");
        ////1차원 3개에 5개씩의 정수를 가지는
        int[][] testArr = new int[3][5];

        //iter하고 enter
        for (int[] ints : testArr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }//end for
            System.out.println();
        }//end for
        
        int[][][] arr3d = {
                {{1,1,1},{2,2,7},{3,3,3}},
                {{4,4,4},{3,3,3},{2,2,2}},
                {{1,1,1},{2,2,2},{5,5,5}}
        };
        System.out.println(arr3d[0][1][2]);

        for (int[][] ints : arr3d) {
            for (int[] anInt : ints) {
                for (int i : anInt) {

                }//end for
            }//end for
        }//end for



    }
}
