package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {

    public static void main(String[] args) {
//
//        * 변경 전 정보: [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]
//        - 수정할 멤버의 이름을 입력하세요.
//                > 김현중
//        김현중은(는) 없는 이름입니다.
//        - 수정할 멤버의 이름을 입력하세요.
//                > 유노윤호
//        유노윤호의 별명을 변경합니다.
//                > 아이노유돈노
//        변경 완료!
//                * 변경 후 정보: [영웅재중, 최강창민, 시아준수, 믹키유천, 아이노유돈노]
        Scanner sc = new Scanner(System.in);

        String[] members = {"영웅재중","최강창민","시아준수","믹기유천","유노윤호"};
        System.out.println("변경 전 정보: [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]");

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print("> ");
            String target = sc.next();

            //탐색 알고리즘
            int index = -1;
            for (int i = 0; i < members.length; i++) {
                if(target.equals(members[i])) {
                    index = i;
                    break;
                }//end if
            }//end fir

            //수정 여부 결정
            if(index != -1) {
                System.out.println(target + "의 별명을 변경합니다.");
                System.out.print(">");
                //members[index] = sc.next();
                String newName = sc.next();
                members[index] = newName;
                System.out.println("변경완료");
                System.out.println("* 변경 후 정보" + Arrays.toString(members));
                break;
            } else {
                System.out.printf("%s는(은)없는 이름입니다.", target);
            }
        }


    }
}
