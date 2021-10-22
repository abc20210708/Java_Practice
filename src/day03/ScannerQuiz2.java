package day03;

import java.util.Scanner;

public class ScannerQuiz2 {

    public static void main(String[] args) {
        //1. 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        //2. 스캐너의 함수들을 사용하여 입력 처리
        //next(), nextLine() :문자열 입력처리, next()는 공백 입력 불가
        //nextInt(), nextDouble(): 각각 정수, 실수 입력 처리


        System.out.print("얼마 있어요?? ");
        int price = sc.nextInt();

        String food = price >= 6000 ? "김치찌개" :(price >= 2500 ? "라면": "굶어!");
        System.out.printf("선택된 음식: %s", food);





        //3. 메모리 자원 반납
        sc.close();
    }
}
