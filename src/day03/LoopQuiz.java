package day03;

import java.util.Scanner;

public class LoopQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.print("정수1: ");
        int num1 = sc.nextInt();

        System.out.print("정수2: ");
        int num2 = sc.nextInt();

        int total = 0;
        for(int x = num1; x <= num2; x++ ) {
            total += x;
        }
        System.out.printf("%d ~ %d까지의 총합: %d", num1, num2, total);


    }
}
