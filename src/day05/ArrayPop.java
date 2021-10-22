package day05;

import java.util.Arrays;

public class ArrayPop {

    public static void main(String[] args) {

        //배열의 끝 데이터를 식제
        int[] arr = {10, 20, 30, 40, 50};

        //1. 사이즈가 1 작은 배열을 생성
        int[] temp = new int[arr.length - 1];

        //2. 맨 마지막 데이터를 제외한 나머지를
        //temp로 복사 //혹은 arr.length -1
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }//end for

        arr = temp; temp = null;

        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("temp: " + Arrays.toString(temp));
     }
}
