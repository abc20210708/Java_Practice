package day05;

import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {


        String[] foods = {"치킨", "피자", "삼겹살", "족발", "파스타"};

        Scanner sc = new Scanner(System.in);

        //순차 탐색 알고리즘 ///앞에서부터 순서대로 찾는 것
        System.out.print("찾는 음식: ");
        String target = sc.next();
        sc.close();

        int index = -1; //찾은 인덱스
        for (int i = 0; i < foods.length; i++) {
            if(target.equals(foods[i])) {
                index = i;
                break;
            }
        }
        boolean reselt = index != -1;
        System.out.println("찾은 음식 탐색 성공???" + reselt);
        System.out.println("찾은 음식의 인덱스: " + index);


    }
}
