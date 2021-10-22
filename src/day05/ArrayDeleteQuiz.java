package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

    public static void main(String[] args) {
//* 우리반 학생들의 별명: [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]
//        - 삭제할 학생의 별명을 입력하세요!
//                > 별빛찬미
//        해당 별명(별빛찬미)은 존재하지 않습니다.
//        - 삭제할 학생의 별명을 입력하세요!
//                > 시아준수
//        시아준수의 별명을 삭제합니다.
//                * 삭제 후 정보: [영웅재중, 최강창민, 믹키유천, 유노윤호]

        Scanner sc = new Scanner(System.in);

        String[] members = {"영웅재중","최강창민","시아준수","믹기유천","유노윤호"};

        System.out.println("* 우리반 학생들의 별명: [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]");


        while (true) {
            System.out.println(" - 삭제할 학생의 별명을 입력하세요!");
            System.out.print(">");
            String target = sc.next();

            //탐색 알고리즘
            int index = -1;
            for (int i = 0; i < members.length; i++) {
                if(target.equals(members[i])) {
                    index = i;
                    break;
                }//end if
            }//end for


            //삭제 여부 결정
            if(target.equals(members[index])) {
                System.out.printf("%s의 별명을 삭제합니다\n", target);
                int delInx = index;

                String[] temp = new String[members.length -1];

                for (int i = delInx; i < members.length-1; i++) {
                    members[i] = members[i+1];
                }//end for

                for (int i = 0; i < temp.length; i++) {
                    temp[i] = members[i];
                }
                members = temp; temp = null;

                System.out.println("*삭제 후 정보: " + Arrays.toString(members));


            } else {
                System.out.printf("해당 별명 (%s)는(은) 존재하지 않습니다!", target);
            }
        }


    }
}
