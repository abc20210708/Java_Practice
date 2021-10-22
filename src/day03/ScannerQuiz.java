package day03;

import java.util.Scanner;

public class ScannerQuiz {

    public static void main(String[] args) {
        //1. 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        //2. 스캐너의 함수들을 사용하여 입력 처리
        //next(), nextLine() :문자열 입력처리, next()는 공백 입력 불가
        //nextInt(), nextDouble(): 각각 정수, 실수 입력 처리

        System.out.println("*** 상품 재고 총액 구하기 ***");
        System.out.print("상품의 가격: ");
        int price = sc.nextInt();

        System.out.print("상품의 수량: ");
        int n = sc.nextInt();

        System.out.printf("상품 재고 총액: %d", price*n);



        //3. 메모리 자원 반납
        sc.close();

    }


}
