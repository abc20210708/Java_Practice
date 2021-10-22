package day05;

import java.util.Arrays;

public class ArrayInsert0 {

    public static void main(String[] args) {

        //2번 인덱스에 30을 추가
        int[] arr = {10, 20, 40, 50, 60};
        int newNumber = 30;

        //1.사이즈 하나 더 큰 배열 생성
        int[] temp = new int[arr.length + 1];


        //2. 기존 데이터를 전부 복사
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }//end for

        //3. 끝데이터부터 뒤로 밀기
        int Idx = 2;
        for (int i = temp.length-1; i >Idx; i--) {
            temp[i] = temp[i-1];
        }//end for

        //4. 타겟인덱스에 데이터 추가
        temp[Idx] = newNumber;

        arr = temp; temp = null;

        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("nArr: " + Arrays.toString(temp));

    }
}
