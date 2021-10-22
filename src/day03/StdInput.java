package day03;

import java.io.IOException;
import java.util.Scanner;

public class StdInput {

    public static void main(String[] args) throws IOException {

        //1. 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);


        //데이터모니터로 내보냄
        //데이터 들어감 /키보드입력
        //2. 스캐너의 함수들을 사용하여 입력 처리
        //next(), nextLine() :문자열 입력처리, next()는 공백 입력 불가
        //nextInt(), nextDouble(): 각각 정수, 실수 입력 처리
        System.out.print("이름을 입력: ");
        String name = sc.next();

        System.out.println("나이를 입력: ");
        int age = sc.nextInt();

        System.out.printf("%s님은 %d살이시군요!\n", name, age);

        //3. 메모리 자원 반납
        sc.close();
    }

}
