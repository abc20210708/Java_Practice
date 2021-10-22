package day03;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {

        
        
        int number = 0;
        int total = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("정수: ");
            number = sc.nextInt();
            total += number;
        }
        while (number != 0) ;
        System.out.println("입력된 누적총합: " + total);
        sc.close();
    }
}
