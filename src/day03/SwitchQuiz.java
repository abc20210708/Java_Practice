package day03;

import java.util.Scanner;

public class SwitchQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("직급을 입력하세요.");
        System.out.println("[사원, 대리, 과장, 차장, 부장]");
        System.out.print("> ");
        String rank = sc.next();
        sc.close();

        switch (rank) {
            case "부장":
                System.out.printf("%s의 급여는 700만원입니다.", rank);
                break;
            case "차장":
                System.out.printf("%s의 급여는 600만원입니다.", rank);
                break;
            case "과장":
                System.out.printf("%s의 급여는 500만원입니다.", rank);
                break;
            case "대리":
                System.out.printf("%s의 급여는 400만원입니다.", rank);
                break;
            case "사원":
                System.out.printf("%s의 급여는 300만원입니다.", rank);
                break;
            default:
                System.out.printf("%s은(는) 없는 직급입니다.\n직급을 다시 입력해주세요", rank);
                break;
        }

    }
}
