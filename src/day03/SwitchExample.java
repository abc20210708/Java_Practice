package day03;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[ 여행을 훤하는 계절을 입력하세요. ]");
        System.out.print(">> ");
        String season = sc.next();
        sc.close();

        double number = 3.3;
        String str = "Hello";

        //switch문에는 문자, 정수형, 변수만 쓸 수 있음.
        switch (season) {
            //case str:
            //case에는 switch에서 작성한 변수에 들어올 값의
            //경우를 리터럴이나 상수형태로 작성함(변수 X)
            case "spring": case "봄": case "春":
                System.out.println("봄에는 남산으로 가보세요");
                break;
            case "여름":
                System.out.println("여름에는 속초으로 가보세요");
                break;
            case "가을":
                System.out.println("가을에는 대청호로 가보세요");
                break;
            case "겨울":
                System.out.println("겨울에는 홍천으로 가보세요");
                break;
            default: //else 역할
                System.out.println("[봄, 여름, 가을, 겨울 중 하나만 입력하세요]");
                //break; 써도 되고 안 써도 됨

        }
    }
}
