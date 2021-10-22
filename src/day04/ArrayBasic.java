package day04;


import java.util.Arrays;


public class ArrayBasic {

    public static void main(String[] args) {

        //1. 배열 변수 선언
        int[] arr;

        //2. 배열 객체 생성 (새로운 방 예약)
        arr = new int[5];


        System.out.println(arr);

        //System.out.println(arr);

        //3.배열의 초기화
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = arr[0] + 20;
        arr[3] = (int) 30.5;
        arr[4] = 100;
        //arr[5] = 55;

        //배열에 길이 - 총 공간 수
        System.out.println(arr.length);


        //배열 반복문 처리
        System.out.println("=======================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }//end for


        //js에서 of -> java는 :
        for (int n : arr) { //for에 마우스 대고 alt + enter
            System.out.print(n + " ");
        }//end for



        //값 목록으로 배열 생성하기
        
        
        //int 배열 타입
        // 값 목록으로 배열 생성시 new를 생략할 수 있는 경우는
        // 첫 배열변수 선언시 이외에는 불가능
        //int[] iArr = new int[] {10, 20, 30};//
        //int[] iArr = new int[3] 중괄호 쓰면 안에 3 지워야 함{10, 20, 30};//
        int[] iArr = {10, 20, 30};//처음 만들 때는 new int[] 생략이 가능함
        
        iArr = new int[]{100, 200, 300}; //다시 수정하면 new int[] 꼭!
        
        String[] foods = {"사과", "딸기", "복숭아", "파인애플"};
        System.out.println("foods.length = " + foods.length);


        System.out.println(Arrays.toString(foods));

        //배열을 생성만하고 초기화하지 않았다면?
        //각 타입의 기본값으로 자동 초기화
        String[] bArr = new  String[5];
        System.out.println(Arrays.toString(bArr));

        //배열 복사 알고리즘

        //1. 원본배열과 크기가 같은 배열을 하나 더 생성
        String[] foods2 = new String[foods.length];

        //2. 원본 배열의 값들을 복사배열로 값 복사
        for (int i = 0; i < foods.length; i++) {
            foods2[i] = foods[i];
        }

        //주소복사 ㄴㄴ, 두 개의 변수가 하나의 객체 조작

        foods[1] = "포도";
        foods2[3] = "애플";

        System.out.println("foods: " + Arrays.toString(foods));
        System.out.println("foods2: " +Arrays.toString(foods2));



    }
}
