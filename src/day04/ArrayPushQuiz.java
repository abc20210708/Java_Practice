package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {

    public static void main(String[] args) {

        //문자열끼리의 동등비교 시 ==을 사용하지 말고
        // 문자열1.equals(문자열2) 를 사용할 것!
        // ex) if (s1 == s2)  (x)
        //     if (s1.equals(s2)) (o)

        System.out.println("#먹고 싶은 음식을 입력하세요");
        System.out.println("#입력을 중지하려면 <그만>이라고 입력하세요");

        Scanner sc = new Scanner(System.in);

        //빈 배열 생성 //누적해야 하기 때문에
        String[] foodList = {};

        while (true) { //ctrl + alt + t
            //음식을 한 번 입력받을 때 해야 할 일
            //1. 일단 음식명을 입력받아야함 -> 스캐너 입력 받아야함
            System.out.print("> ");
            String newFood = sc.nextLine();

            //배열에 들어가기 전에 break "그만"은 배열에 들어가면 안 되니까
            if(newFood.equals("그만")) {
                break;
            }

            //2.배열의 신규 데이터가 들어갈 공간 확보
            String[] temp = new String[foodList.length + 1];

            //3. 기존에 저장된 음식들을 모두 신규배열로 복사
            for (int i = 0; i < foodList.length; i++) {
                temp[i] = foodList[i];
            }
            //4.신규 데이터를 마지막 인덱스에 추가
            temp[temp.length-1] = newFood;

            foodList = temp;
            temp = null;
        }//end while

        System.out.println("먹고싶은 음식: " + Arrays.toString(foodList));
        sc.close();
    }
}
