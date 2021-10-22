package day04;

import java.util.Arrays;

public class ArrayPush {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        int newData = 40;

        // 1.원본 배열보다 사이즈가 1개 더 큰 새 배열을 생성
        int[] temp = new int[arr.length + 1];

        //2. 원본 배열 데이터를 값 복사하여 신규배열로 이동
        //기존 데이터를 큰방으로
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        //3. 새로운 데이터를 신규배열의 맨 끝에 추가
        //맨 끝 방으로 안내
        temp[temp.length-1] = newData;

        //4.주소 값 이전 //주소 값 복사
        arr = temp; temp = null;


        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("temp: " + Arrays.toString(temp));

        //빈배열 만들기
        //String[] sArr = {}; 혹은
        String[] sArr = new String[0];



    }
}
