package day03;

import java.util.Scanner;

public class LoopQuiz0 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        System.out.print("정수1: ");
        int begin = sc.nextInt();
        System.out.print("정수1: ");
        int end = sc.nextInt();

        sc.close();

        for(int n = begin; n <= end; n++) {
            total += n;
        }
        System.out.printf("%d~%d까지의 누적총합: %d\n ",begin, end, total);
        





    }
}
