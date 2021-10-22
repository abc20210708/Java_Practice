package day02;

public class Casting2 {

    public static void main(String[] args) {


        //크기가 다른 타입끼리의 연산은 작은 것을
        //큰 것으로 변환함.
        char c = 'B';
        int i = 2;
        int result = c + i;
        System.out.println(c + i);

        //double, int
        System.out.println(30.0 + 50);

        char result2 = (char)(c + i);
        System.out.println("result2 = " + result2);


        //int 보다 작은 (byte, char, short) 타입끼리의
        //연산은 결과가 자동으로 int로 처리됨.
        byte b1 = 100;
        byte b2 = 120;
        int b3 = b1 + b2;


        System.out.println("==========");
        int n1 = 27,n2 = 5;

        //한 쪽을 다른 타입으로 바꿔서
        //double result3 = n1 / (double)n2;
        double result3 = (double)n1 / n2;//5를 5.0
        System.out.println("result3 = " + result3);
    }
}
