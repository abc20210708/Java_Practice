package day05;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        //2번 인덱스에 30을 추가
        int[] arr = {10, 20, 40, 50, 60};
        int newNumber = 30;

        int[] nArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            nArr[i] = arr[i];
        }//end for

        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("nArr: " + Arrays.toString(nArr));

        int delIdx = 2;
        for (int i = nArr.length-1; i > delIdx; i--) {
            nArr[i] = nArr[i-1];
        }//end for

        nArr[2] = newNumber;


        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("nArr: " + Arrays.toString(nArr));

    }
}
